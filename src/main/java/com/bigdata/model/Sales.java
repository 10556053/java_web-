/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bigdata.model;


import java.util.Date;

/* Time: 2020-08-21 19:41:57 @author freecodeformat.com @website http://www.freecodeformat.com/json2javabean.php */
public class Sales {

    private String region;
    private String country;
    private String itemtype;
    private String saleschannel;
    private String orderpriority;
    private String orderdate;
    private int orderid;
    private String shipdate;
    private int unitsdold;
    private double unitprice;
    private double unitcost;
    private double cotalrevenue;
    private double totalcost;
    private double totalprofit;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public String getSaleschannel() {
        return saleschannel;
    }

    public void setSaleschannel(String saleschannel) {
        this.saleschannel = saleschannel;
    }

    public String getOrderpriority() {
        return orderpriority;
    }

    public void setOrderpriority(String orderpriority) {
        this.orderpriority = orderpriority;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(String orderdate) {
        this.orderdate = orderdate;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getShipdate() {
        return shipdate;
    }

    public void setShipdate(String shipdate) {
        this.shipdate = shipdate;
    }

    public int getUnitsdold() {
        return unitsdold;
    }

    public void setUnitsdold(int unitsdold) {
        this.unitsdold = unitsdold;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getUnitcost() {
        return unitcost;
    }

    public void setUnitcost(double unitcost) {
        this.unitcost = unitcost;
    }

    public double getCotalrevenue() {
        return cotalrevenue;
    }

    public void setCotalrevenue(double cotalrevenue) {
        this.cotalrevenue = cotalrevenue;
    }

    public double getTotalcost() {
        return totalcost;
    }

    public void setTotalcost(double totalcost) {
        this.totalcost = totalcost;
    }

    public double getTotalprofit() {
        return totalprofit;
    }

    public void setTotalprofit(double totalprofit) {
        this.totalprofit = totalprofit;
    }

    
}
