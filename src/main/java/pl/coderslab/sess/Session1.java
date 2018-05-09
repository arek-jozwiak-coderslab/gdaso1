package pl.coderslab.sess;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/session1")
public class Session1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("attributeName1", "AttributeValue");
        session.setAttribute("attributeName2", 5);
        List<String> someStrings = Arrays.asList(new String[]{"one", "two"});
        session.setAttribute("attributeName3", someStrings);
        session.setAttribute("attributeName4", new Book("Thinking in Java"));
    }
}
