package com.joelbeckum;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, 0, true);
        printer.fillToner(20);
        printer.fillToner(50);
        printer. printPages(12);
        printer.printPages(7);
        printer.printPages(1);
    }
}
