package com.tom.ticket;
public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 400;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination) {
        this.start = start;
        this.destination = destination;
        int diff=Math.abs(start.id-destination.id);
        System.out.println("diff:" +diff);
        switch(diff){
            case 100:
                price=500;
                break;
            case  200:
                price=600;
                break;
            case 300:
                price=1100;
                break;

        }
        System.out.println("price:"+price);
    }

    public void print() {
    }
}
