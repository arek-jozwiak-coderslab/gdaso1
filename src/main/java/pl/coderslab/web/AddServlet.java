package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("asda");

        String[] bparams = request.getParameterValues("b");
        System.out.println(Arrays.toString(bparams));

        Map<String, String[]> params = request.getParameterMap();
        Set<String> keys = params.keySet();
        for (String key : keys) {
            System.out.println(Arrays.toString(params.get(key)));
        }


//        http://localhost:8080/add?a=123&b=765
        System.out.println("asdasd");
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        response.getWriter().append("result = " + result);
    }
}
