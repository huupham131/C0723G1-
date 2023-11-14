package com.example.kiem_tra_module3.controller;

import com.example.kiem_tra_module3.model.TaiKhoan;
import com.example.kiem_tra_module3.model.VePhat;
import com.example.kiem_tra_module3.model.VePhatDTO;
import com.example.kiem_tra_module3.service.IVePhatService;
import com.example.kiem_tra_module3.service.impl.VePhatService;
import sun.rmi.server.Dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "VePhatServlet", value = "/vephat")
public class VePhatServlet extends HttpServlet {
    private final IVePhatService vePhatService = new VePhatService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showAddForm(req,resp);
                break;
            case "delete":
                break;
            default:
                showList(req,resp);
                break;
        }
    }

    private void showAddForm(HttpServletRequest req, HttpServletResponse resp) {
        List<TaiKhoan> taiKhoans = vePhatService.layTatCaTK();
        req.setAttribute("danhsachTK", taiKhoans);
        try {
            req.getRequestDispatcher("view/create.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) {
        List<VePhatDTO> vePhatDTOS = vePhatService.hienThiVePhat();
        try {
            req.setAttribute("danhsachve",vePhatDTOS);
            req.getRequestDispatcher("view/list.jsp").forward(req,resp);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                insertNew(req,resp);
                break;
            case "delete":
                break;
            default:
                showList(req,resp);
                break;
        }
    }

    private void insertNew(HttpServletRequest req, HttpServletResponse resp) {
        int soDKTN = Integer.parseInt(req.getParameter("soDKThuNuoi"));
        String maVP = "MV_5";
        String mota =req.getParameter("moTaLoi");
        String ngayVP= req.getParameter("ngayGioVP");
        String soTien = req.getParameter("soTienDongPhat");
//        VePhat vePhat = new VePhat()
    }
}
