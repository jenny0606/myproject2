package com.tom.sales;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer>customers=new ArrayList<>();
        customers.add(new Customer("0001", 1200));
        customers.add(new Customer("0002", 800));

        SilverCustomer c3 = new SilverCustomer("0003", 2000);
        GoldenCustomer c4 = new GoldenCustomer("0004", 5000);
        PlatinumCustomer   c6=new PlatinumCustomer("0006",5000) ;

        c3.print();
        c4.print();
        c6.print();
    }
}
