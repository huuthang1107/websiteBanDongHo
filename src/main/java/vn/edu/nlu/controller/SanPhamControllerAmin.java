package vn.edu.nlu.controller;

import vn.edu.nlu.bean.Product;
import vn.edu.nlu.entity.SanPhamAdmin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SanPhamControllerAmin", urlPatterns = "/SanPhamControllerAmin")
public class SanPhamControllerAmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SanPhamAdmin spa = new SanPhamAdmin();
        List<Product> listP = spa.getAllProduct();
        request.setAttribute("SP",listP);
        request.getRequestDispatcher("view/admin/dachsachsanpham.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
