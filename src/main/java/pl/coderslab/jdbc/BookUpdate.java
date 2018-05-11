package pl.coderslab.jdbc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookEdit")
public class BookUpdate extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book(
                request.getParameter("title"),
                request.getParameter("author"),
                request.getParameter("isbn")
        );
        book.setId(Integer.parseInt(request.getParameter("id")));
        BookDao bookDao = new BookDao();
        bookDao.update(book);
        response.sendRedirect( request.getContextPath() +"/bookAll");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        BookDao bookDao = new BookDao();
        Book book = bookDao.read(id);
        request.setAttribute("book", book);
        getServletContext().getRequestDispatcher("/book/editbook.jsp").forward(request, response);
    }
}
