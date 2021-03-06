/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.io.IOUtils;

/**
 *
 * @author student
 */
@WebServlet(urlPatterns = {"/servlet/upload"})
@MultipartConfig (
        fileSizeThreshold = 1024*1024*1,
        maxFileSize = 1024*1024*10,
        maxRequestSize = 1024*1024*10,
        location = "C:/upload"
)
public class UploadServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        
         req.getParts().stream()
                .filter(part -> part.getName().equals("myfile"))
                 .forEach(part ->{
                         try {
                                String fname = part.getSubmittedFileName();
                                part.write(fname);
                                out.print(fname + " Upload OK !");
                                // 圖片
                                String imagePath = "/JavaWeb0727/servlet/image?fname=" + fname;
                                out.println(String.format("<p><img width='150' src='%s'>", imagePath));
                        } catch (Exception e) {
                        }
                 });
         req.getParts().stream()
                .filter(part -> part.getName().equals("name"))
                .forEach(part -> {
                    try {
                        String desc = IOUtils.toString(part.getInputStream(), StandardCharsets.UTF_8.name());
                        out.print(desc);
                    } catch (Exception e) {
                    }
                });
    }
    
}
