package vn.edu.nlu.controller;

import vn.edu.nlu.bean.Product;
import vn.edu.nlu.entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet(name = "donghocap",urlPatterns = "/donghocap")
public class donghocap extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Collection<Product> values = new ProductEntity().getAllCap();
        request.setAttribute("data", values);
        request.getRequestDispatcher("donghocap.jsp").forward(request,response);
    }
}
