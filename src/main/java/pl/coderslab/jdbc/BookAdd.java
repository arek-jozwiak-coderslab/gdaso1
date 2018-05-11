package pl.coderslab.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addBook")
public class BookAdd extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book(
                request.getParameter("title"),
                request.getParameter("author"),
                request.getParameter("isbn")
        );

        if (!BookValidator.isValid(book)) {
            request.setAttribute("book", book);
            doGet(request, response);
        } else {
            BookDao bookDao = new BookDao();
            bookDao.create(book);
            response.sendRedirect(request.getContextPath() + "/bookAll");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/book/addbook.jsp").forward(request, response);
    }
}
