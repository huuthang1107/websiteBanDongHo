package vn.edu.nlu.controller;

import vn.edu.nlu.entity.ProductEntity;
import vn.edu.nlu.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

@WebServlet(name = "danhsachtaikhoan", urlPatterns = "/danhsachtaikhoan")
public class danhsachtaikhoan extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductEntity pe = new ProductEntity();
        List<User> users = pe.getAllUser();
        request.setAttribute("listUser", users);
        request.getRequestDispatcher("admin/examples/danhsachtaikhoan.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doGet(request,response);
    }
}
