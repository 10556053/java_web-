/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clockon.controler;

import com.clockon.model.ClockOnModel;
import java.io.IOException;
import java.util.List;
import java.util.Map;
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
@WebServlet("/controller/clockonreport")
public class ClockOnReportServlet extends HttpServlet {
    private ClockOnModel model = new ClockOnModel();
    protected void doHandler(String no ,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        List<Map<String, String>> logs = null;
        if(no.equalsIgnoreCase("all")) {
            logs = model.queryClockOn();
        } else {
            logs = model.queryClockOn(no);
        }
        //給<%=request.getAttribute("logs")%>設值
        req.setAttribute("logs",logs);
        //打卡完後
        //重島到clock_on.jsp
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/clockon/view/clock_on.jsp");
        rd.forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String no = req.getAttribute("no").toString();
        doHandler(no,req, resp);
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String no = req.getParameter("no");
        doHandler(no,req, resp);
    }
    
}
