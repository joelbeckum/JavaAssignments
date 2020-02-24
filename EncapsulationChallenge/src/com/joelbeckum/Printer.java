package com.joelbeckum;

public class Printer {
    private double tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(double tonerLevel, int pagesPrinted, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;

        if (tonerLevel < 0) {
            this.tonerLevel = 0;
        }
        if (pagesPrinted < 0) {
            this.pagesPrinted = 0;
        }
        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void fillToner(double toner) {
        this.tonerLevel += toner;
        if (this.tonerLevel > 100) {
            this.tonerLevel = 100;
        }
        System.out.println("Toner level at " + this.tonerLevel + "%");
    }

    public void printPages(int pages) {
        if (!this.duplex) {
            System.out.println("Printed " + pages + " pages");
            this.pagesPrinted += pages;
        } else if (this.duplex) {
            int sheets = (pages / 2) + (pages % 2);
            System.out.println("Printed " + pages + " pages on " + sheets + " sheets of paper");
            this.pagesPrinted += pages;
        }
    }
}
