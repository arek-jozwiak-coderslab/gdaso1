package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc132")
public class Mvc132 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String color1 = request.getParameter("color1");
        String brand1 = request.getParameter("brand1");
        String model1 = request.getParameter("model1");
        String color2 = request.getParameter("color2");
        String brand2 = request.getParameter("brand2");
        String model2 = request.getParameter("model2");

        Car c1 = new Car(color1, brand1, model1);
        Car c2 = new Car(color2, brand2, model2);

        List<Car> cars= new ArrayList<>();
        cars.add(c1);
        cars.add(c2);

        request.setAttribute("cars", cars);

        getServletContext().getRequestDispatcher("/mvc132result.jsp")
                .forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/mvc132form.jsp")
                .forward(request, response);
    }
}
