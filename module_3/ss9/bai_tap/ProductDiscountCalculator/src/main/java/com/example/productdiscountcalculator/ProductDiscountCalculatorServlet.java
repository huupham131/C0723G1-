package com.example.productdiscountcalculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calServlet",value = "/cal")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));
        double discount = Double.parseDouble(req.getParameter("discountPercent"));
        double discountAmount = price *discount * 0.01;
        double discountPrice = price - discountAmount;
        req.setAttribute("description", description);
        req.setAttribute("discountAmount", discountAmount);
        req.setAttribute("discountPrice", discountPrice);
        req.getRequestDispatcher("/result.jsp").forward(req,resp);

    }
}
