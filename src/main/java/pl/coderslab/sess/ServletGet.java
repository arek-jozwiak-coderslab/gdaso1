package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/getAttribute")
public class ServletGet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String attribute1 = (String) session.getAttribute("attributeName1");
        int attribute2 = (int) session.getAttribute("attributeName2");
        List<String> attribute3 = (List<String>) session.getAttribute("attributeName3");
        Book attribute4 = (Book) session.getAttribute("attributeName4");
        System.out.println(attribute1);
        System.out.println(attribute2);
        System.out.println(attribute3.toString());
        System.out.println(attribute4.getTitle());
    }
}
