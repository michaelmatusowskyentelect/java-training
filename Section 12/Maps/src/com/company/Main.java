package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Brooklyn", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>();

        if (theatre.reservedSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
        if (theatre.reservedSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }
        if (theatre.reservedSeat("B13")) {
            System.out.println("Please pay for A13");
        } else {
            System.out.println("Seat already reserved");
        }


        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);
    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber()+ " R" + seat.getPrice());
        }
        System.out.println();
        System.out.println("===================================================================================");
    }


}
