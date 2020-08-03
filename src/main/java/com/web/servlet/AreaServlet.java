/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebServlet(name = "lotto",urlPatterns = {"/servlet/area"},initParams = {
        @WebInitParam(name = "type",value = "c")
        ,@WebInitParam(name = "w",value = "10")
        ,@WebInitParam(name = "h",value = "5")
        ,@WebInitParam(name = "r",value = "10")
        ,@WebInitParam(name = "b",value = "10")})
public class AreaServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        
        
        String type = req.getParameter("type");
        int r = Integer.parseInt(req.getParameter("r"));
        int w = Integer.parseInt(req.getParameter("w"));
        int h = Integer.parseInt(req.getParameter("h"));
        int b = Integer.parseInt(req.getParameter("b"));
        
        double area = 0;
        switch(type){
            case "c":
                area = r*r*Math.PI;
                break;
            case "r":    
                area = w*h;
                break;
            case "t":      
                area = (b*h)/2;
                break;
        }
        
        PrintWriter writer = resp.getWriter();
        writer.print("<html>");
        writer.print("<body>");
        writer.print("<h1>");
        writer.print("本期樂透開獎號碼 : ");
        writer.print(String.valueOf(area));
        writer.print("</h1>");
        writer.print("</body>");
        writer.print("</html>");
    }
    
}
