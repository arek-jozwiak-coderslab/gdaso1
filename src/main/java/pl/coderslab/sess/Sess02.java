package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/sess02")
public class Sess02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        int grade = Integer.parseInt(request.getParameter("grade"));
        if (grade > 0 && grade < 7) {
            int[] grades = (int[]) session.getAttribute("grades");
            if (grades == null) {
                //if variable not exist in session
                grades = new int[]{grade};
            } else {
                //variable exist in session
                grades = addToTab(grades, grade);
            }
            session.setAttribute("grades", grades);
        }
    }


    public double countAvg(int[] grades) {
        double sum = 0;
        for (int el : grades) {
            sum += el;
        }
        return sum / grades.length;
    }

    /**
     * With java 8 streams - example
     * @param grades
     * @return
     */
    public double countAvg2(int[] grades) {
        double sum =  Arrays.stream(grades).sum();
        return sum / grades.length;
    }

    public static int[] addToTab(int[] grades, int grade) {
        int[] newTab = Arrays.copyOf(grades, grades.length + 1);
        newTab[grades.length] = grade;
        return newTab;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        pw.append("<form method='post'>");
        pw.append("<input type='text' name='grade'/><br/>");
        pw.append("<input type='submit'/>");
        pw.append("</form>");
        int[] grades = (int[]) session.getAttribute("grades");
        pw.append("<hr/>").append(Arrays.toString(grades));
        if (grades != null) {
            pw.append("avg = ").append(countAvg(grades) + "");
        }
    }
}
