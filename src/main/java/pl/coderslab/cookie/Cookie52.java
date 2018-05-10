package pl.coderslab.cookie;

import pl.coderslab.utils.CookieWebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String cookieValue = CookieWebUtils.getCookieValue("cookie50", request);

        if(cookieValue!=null) {
            response.getWriter().append("Witamy na stronie 52");
        }else{
            response.sendRedirect(request.getContextPath() + "/cookie51");
        }
    }
}
