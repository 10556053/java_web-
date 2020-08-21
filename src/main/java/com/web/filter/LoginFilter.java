/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author student
 */
@WebFilter("/servlet/result")
public class LoginFilter extends HttpFilter {
    //在filter裡面驗證
    //抓email,password,和remember me
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        
        //res.getWriter().print("LoginFilter OK");
        String email = req.getParameter("email");
        String passwoed = req.getParameter("password");
        String remember = req.getParameter("remember");
        
        if(remember!=null){
            Cookie cookie = new Cookie("email",email);
            cookie.setMaxAge(60*60);
            res.addCookie(cookie);
        }
        if(email.contains("admin")){
            chain.doFilter(req, res);
        }else{
            RequestDispatcher rd= getServletContext().getRequestDispatcher("/error/loginerror.jsp");
            rd.forward(req, res);
        }
        
        res.getWriter().print(email);
        res.getWriter().print(passwoed);
        res.getWriter().print(remember);
        
        //

    }
    
}
