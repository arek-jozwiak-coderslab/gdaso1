package pl.coderslab.sess;

import pl.coderslab.kol1.Main;
import pl.coderslab.utils.RequestUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/sess07")
public class Sess07 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        HttpSession session = request.getSession();
        Map<String, String> capitals = (Map<String, String>) session.getAttribute("capitals");
        if (capitals == null) {
            capitals = new HashMap<>();
            capitals.put("Niemcy", "Berlin");
            capitals.put("Czechy", "Praga");
            session.setAttribute("capitals", capitals);
        }


        PrintWriter pw = response.getWriter();

        Set<String> keys = capitals.keySet();
        Random r = new Random();

        List<String> list = new ArrayList<String>(keys);
        String obj = list.get(r.nextInt(keys.size()));

        pw.append("Podaj stolicę dla kraju: " + obj);

        session.setAttribute("shuffledValue", obj);

        pw.append("<form method='post'>");
        pw.append("<input type='text' name='answer'/><br/>");
        pw.append("<input type='submit'/>");
        pw.append("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");

        int points = RequestUtils.getIntFromSession("points", 0, session);
        String answer = req.getParameter("answer");
        resp.getWriter().append(answer).append("<br/>");

        Map<String, String> capitals = (Map<String, String>) session.getAttribute("capitals");
        String shuffledValue = (String) session.getAttribute("shuffledValue");
        if (answer.equals(capitals.get(shuffledValue))){
            points++;
            session.setAttribute("points", points);
            resp.getWriter().append("OK");
        }else{
            resp.getWriter().append("NOT OK");
        }
        capitals.remove(shuffledValue);
        resp.getWriter().append("<br/>").append("points = " +points);
    }
}
