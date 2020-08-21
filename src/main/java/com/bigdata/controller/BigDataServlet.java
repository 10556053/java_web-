/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.controller;

import com.bigdata.model.Sales;
import com.bigdata.model.SalesModel;
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
@WebServlet("/servlet/bigdata")
public class BigDataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country = req.getParameter("country");
        Sales[] saleses =null;
        if (country ==null) {
            req.setAttribute("saleses",SalesModel.getSaleses() );
            
        }else{
            req.setAttribute("saleses", SalesModel.getSalesCountry(country));
            
        }
        
        // 設定 request attribute
        RequestDispatcher rd = getServletContext().getRequestDispatcher("/form/bigdataform.jsp");
        rd.forward(req, resp);
    }  
    
}
