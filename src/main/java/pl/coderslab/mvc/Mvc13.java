package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color = request.getParameter("color");
        String brand = request.getParameter("brand");
        String model = request.getParameter("model");

        Car c = new Car(color, brand, model);

        request.setAttribute("car", c);

        getServletContext().getRequestDispatcher("/mvc13result.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/mvc13form.jsp")
                .forward(request, response);
    }
}
