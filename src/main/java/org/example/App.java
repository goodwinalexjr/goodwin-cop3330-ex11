package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("How many euros are you exchanging? ");
        String i1 = money.nextLine();
        double euro = Double.parseDouble(i1);
        System.out.print("What is the exchange rate? ");
        String i2 = money.nextLine();
        double exchange = Double.parseDouble(i2);

        DecimalFormat nf = new DecimalFormat("#.00");
        double total = ((euro * exchange) / 100);

        System.out.println(nf.format(euro) + " euroes at an exchange rate of " + nf.format(exchange) + " is");
        System.out.println(nf.format(total) + " U.S. dollars.");
    }
}
