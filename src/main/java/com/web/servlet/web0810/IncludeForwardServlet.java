/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet.web0810;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet("/servlet/includeforward")
public class IncludeForwardServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int x = 20;
        int y = 30;
        String path = "/result/add.jsp";
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(path);
        req.setAttribute("x", x);
        req.setAttribute("y", y);
//        dispatcher.forward(req, resp);
        dispatcher.include(req, resp);
        
        PrintWriter out = resp.getWriter();
        out.print("Servlet :"+req.getAttribute("sum"));
    }
    
}
