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

@WebServlet("/get2")
public class Get2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//http://localhost:8080/get2?user=arek&lang=pl&meal=pizza&addition=chees&addition=onion
        Map<String, String[]> params = request.getParameterMap();
        Set<String> keys = params.keySet();
        for (String key : keys) {
            System.out.print(key + " : ");
            System.out.println(Arrays.toString(params.get(key)));
        }
    }
}
