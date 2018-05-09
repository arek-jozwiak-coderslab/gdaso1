package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/hello")
public class HelloWorld extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int first = 456;
        int second = 144;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().append("ążśðćłó");
        response.getWriter().append(" ");
        response.getWriter().append("<h1>Hello Arek</h1>");
        response.getWriter().append("result: " + first*second);
        response.getWriter().append("<form method='get'>")


                .append("");
    }


}
