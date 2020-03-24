package com.joelbeckum;

public class Main {

    public static void main(String[] args) {
	    ITelephone joelsPhone;
	    joelsPhone = new DeskPhone(1234567);
	    joelsPhone.powerOn();
	    joelsPhone.callPhone(1234567);
	    joelsPhone.answer();
    }
}
