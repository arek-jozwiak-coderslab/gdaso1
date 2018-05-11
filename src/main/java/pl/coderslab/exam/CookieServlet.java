package pl.coderslab.exam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/homepage")
public class CookieServlet extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accept = request.getParameter("accept");
        if(accept!=null){
            Cookie acceptCookie = new Cookie("accept", "true");
            response.addCookie(acceptCookie);
            response.sendRedirect( request.getContextPath() +"/homepage");
        }else {
            getServletContext().getRequestDispatcher("/homepage.jsp").forward(request, response);
        }
    }
}
