package com.example.servertime;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet(name = "ServerTimeServlet", value = "/date")
public class ServerTimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Date today = new Date();
        String s = ""+today;
        request.setAttribute("today", s);
        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }
}