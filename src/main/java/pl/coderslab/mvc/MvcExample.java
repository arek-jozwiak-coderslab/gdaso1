package pl.coderslab.mvc;

import org.apache.commons.lang3.StringUtils;
import pl.coderslab.sess.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvcExample")
public class MvcExample extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/mvcResult");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String c = StringUtils.capitalize(b+a);
        String d = StringUtils.reverse(c+a);

        HttpSession session = request.getSession();

        request.setAttribute("myd", d);
        request.setAttribute("book", new Book("Thinkink in Java"));

        List<Book> books = new ArrayList<>();
        books.add(new Book("Java 2 podstawy"));
        books.add(new Book("Thinkink in Java"));


        request.setAttribute("books", books);

        getServletContext().getRequestDispatcher("/mvcExample.jsp")
                .forward(request, response);

    }
}
