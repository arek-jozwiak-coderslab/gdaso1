package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/post4")
public class Post4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] numbers = request.getParameterValues("numbers");
        List<Integer> intNumbers = new ArrayList<>();
        for (String s: numbers ) {
            try{
                intNumbers.add(Integer.parseInt(s));
            }catch (NumberFormatException ex){
            }
        }
        Collections.sort(intNumbers);
        response.getWriter().append(intNumbers.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        Random r = new Random();
        int count = r.nextInt(5)+5;
        pw.append("<form method='post'>");
        for (int i =0; i<count;i++){
            pw.append("<input type='text' name='numbers'/><br/>");
        }
        pw.append("<input type='submit'/>");
        pw.append("</form>");
    }
}
