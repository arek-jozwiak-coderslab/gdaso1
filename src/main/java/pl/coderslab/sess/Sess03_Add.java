package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Sess03_Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        session.setAttribute(key, value);
        List<String> paramNames = (List<String>) session.getAttribute("paramNames");
        if (paramNames == null) {
            paramNames = new ArrayList<>();
            paramNames.add(key);
        } else {
            paramNames.add(key);
        }
        session.setAttribute("paramNames", paramNames);
    }


}
