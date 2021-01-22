package vn.edu.nlu.controller;

import vn.edu.nlu.bean.Product;
import vn.edu.nlu.bean.cart;
import vn.edu.nlu.dao.DAO;
import vn.edu.nlu.entity.ProductEntity;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "addCart", value = "/addCart")
public class addCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html:charset=UTF-8");
        String id = request.getParameter("cid");
        if(id==null) request.getParameter("cart.jsp");
        ProductEntity pe = new ProductEntity();
        Product p =  pe.getById(id);
        if(p==null){
            response.sendRedirect("cart.jsp");
            return;
        }
        HttpSession session = request.getSession();
//        session.getAttribute("cart");
        cart c = cart.getCart(session);
        c.put(p);

        session.setAttribute("cart",c);
        c.commit(session);
//        System.out.println(123);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
