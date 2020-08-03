/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
public class BMIServlet extends HttpServlet{
    private void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String h = req.getParameter("h");
        String w = req.getParameter("w");
        PrintWriter out = resp.getWriter();
        out.print("doPost");
        if(h==null ||w ==null ){
            out.print("please input h and w");
            return;
        }
        double height = Double.parseDouble(h);
        double weight = Double.parseDouble(w);
        double bmi = weight/Math.pow(height/100,2);
        out.print(bmi);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandler(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //doHandler(req,resp);接受get方法
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("doget not working");
        printWriter.print("<a href='/JavaWeb0727/form/bmiform.jsp'>Click me</a>");
        
    }
    
}
