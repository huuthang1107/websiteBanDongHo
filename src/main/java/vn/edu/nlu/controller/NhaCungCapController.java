package vn.edu.nlu.controller;

import vn.edu.nlu.entity.ProductEntity;
import vn.edu.nlu.bean.NhaCungCap;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "NhaCungCapController", urlPatterns = "/NhaCungCapController")
public class NhaCungCapController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductEntity pe = new ProductEntity();
        List<NhaCungCap> listNCC = pe.getAllNCC();
        request.setAttribute("listNCC", listNCC);
        request.getRequestDispatcher("danhsachhangsanxuat.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
