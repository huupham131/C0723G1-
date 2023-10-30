package com.example.listcustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name="customerServlet", value="/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Hữu","1998-01-13", "Quảng Ngãi", "https://media-cdn-v2.laodong.vn/Storage/NewsPortal/2020/5/2/802649/Bat-Cuoi-Truoc-Loat-.png"));
        customerList.add(new Customer("Giang","2002-02-13", "Quảng Bình", "https://media.baoquangninh.vn/dataimages/201209/original/images647688_a.jpg"));
        customerList.add(new Customer("Thuận","1996-01-13", "Quảng Trị", "https://nld.mediacdn.vn/291774122806476800/2023/5/17/3471044557860853628333446226731026240094406n-16842998525331526811843.jpg"));
        customerList.add(new Customer("Quyền","2002-01-13", "Quảng Ngãi", "https://vcdn-vnexpress.vnecdn.net/2016/01/06/hai-duong-1-5631-1452070449.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("customerList", customerList );
        req.getRequestDispatcher("list.jsp").forward(req,resp);
    }
}
