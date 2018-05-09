package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookieDel")
public class CookieDel extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        String cookieName = "User";
        for (Cookie c : cookies) {
            if (cookieName.equals(c.getName())) {
                c.setMaxAge(0);
                response.addCookie(c);
            }
        }
        response.getWriter().append("deleted");
    }
}
