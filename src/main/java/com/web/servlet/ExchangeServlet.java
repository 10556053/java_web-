/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;

/**
 *
 * @author student
 */
//注意，這裡註冊容易出錯
@WebServlet ("/servlet/exchange")
public class ExchangeServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //將servlet計算結果分派
        RequestDispatcher rd = req.getRequestDispatcher("/result/exchangeresult.jsp");
        rd.forward(req, resp);
        
    }
    
}
