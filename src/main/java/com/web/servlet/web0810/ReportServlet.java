/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet.web0810;

import java.io.IOException;
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

@WebServlet("/servlet/report")
public class ReportServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        
        
        String headerPath = "/result/report/head.jsp";
        String footPath = "/result/report/foot.jsp";
        String part01Path = "/result/report/part01.jsp";
        String part02Path = "/result/report/part02.jsp";
        String part03Path = "/result/report/part03.jsp";
        
         RequestDispatcher rd = null;
        //可以把不同的jsp組件組合起來
        rd = getServletContext().getRequestDispatcher(headerPath);
        rd.include(req, resp);
        
        rd = getServletContext().getRequestDispatcher(part01Path);
        rd.include(req, resp);

        rd = getServletContext().getRequestDispatcher(part02Path);
        rd.include(req, resp);

        rd = getServletContext().getRequestDispatcher(part03Path);
        rd.include(req, resp);
        
        rd = getServletContext().getRequestDispatcher(footPath);
        rd.include(req, resp);
       
    }
    
}
