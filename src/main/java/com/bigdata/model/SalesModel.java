/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.model;

import com.google.gson.Gson;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author student
 */
public class SalesModel {
    private static Sales[] saleses;
    static {
        
        try {
            //json file
            String path = "C:\\Users\\student\\Documents\\NetBeansProjects\\JavaWeb0727\\src\\main\\java\\com\\bigdata\\model\\csvjson.json";
            File file = new File(path);
            String json = new Scanner(file).useDelimiter("\\A").next();
            saleses=new Gson().fromJson(json, Sales[].class);
           
        } catch (Exception e) {
        }

        
                
    }

    public static Sales[] getSaleses() {
        return saleses;
    }
    
    public static List<Sales> getSalesCountry(String country){
        return Arrays.stream(saleses)
                .filter(s->s.getCountry().contains(country))
                .collect(toList());
                
    }
    
    
}
