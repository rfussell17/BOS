package com.rfussell;

import static com.rfussell.BonusOnSavings.computeBonus;

public class Main {
    public static void main (String[] args) {
        System.out.println("Total bonus for person1 is: $" + computeBonus(2000, 5000, 7000, 4000, 8000));
        System.out.println("");
        System.out.println("Total bonus for person2 is: $" + computeBonus(3000, 6000, 9000, 10000, 17000));
    }
}