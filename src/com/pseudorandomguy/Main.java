package com.pseudorandomguy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Bank JPMorgan = new Bank("JP Morgan");
        Bank MorganStanley = new Bank("Morgan Stanley");

        JPMorgan.addBranch();
        JPMorgan.addBranch();

        JPMorgan.addCustomer(1, 100);
        JPMorgan.addCustomer(2, 200);

        MorganStanley.addBranch();
        MorganStanley.addBranch();



    }
}
