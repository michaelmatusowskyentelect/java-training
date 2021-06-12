package com.company;

public class Printer {

    private Toner toner;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(Toner toner, int printedPages, boolean duplexPrinter) {
        this.toner = toner;
        this.printedPages = printedPages;
        this.duplexPrinter = duplexPrinter;
    }


}
