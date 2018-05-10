package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Sess05")
public class Sess05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int captchaResult = Integer.parseInt(request.getParameter("captcha"));
        HttpSession session = request.getSession();
        int captchaSession = (int) session.getAttribute("sum");
        if (captchaResult == captchaSession) {
            response.getWriter().append("CAPTCHA OK");
        } else {
            response.getWriter().append("CAPTCHA NOT OK");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random r = new Random();
        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int c = a + b;
        HttpSession session = request.getSession();
        session.setAttribute("sum", c);

        request.setAttribute("a", a);
        request.setAttribute("b", b);

        getServletContext().getRequestDispatcher("/sess05.jsp")
                .forward(request, response);
    }
}
