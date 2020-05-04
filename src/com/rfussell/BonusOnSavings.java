package com.rfussell;



/**
 * Class: BonusOnSavings.java
 * Purpose: Write a program to compute the total bonus amount earned by 2 employees in the year.
 * @author: Robin Fussell
 * Date:  October 1, 2019
 * Version
 * *

This program calls a method that calculates quarterly and annual bonuses for amount saved.
The method has several conditions that cycle the amount saved through if/else statements
to determine the bonuses each person will received based on their money saved.


 *SAMPLE OUTPUT

No bonus for Q1
Quarter 2 Bonus: 210.0
No bonus for Q3
Quarter 4 Bonus: 240.0
Annual bonus is: 1200.0
Total bonus for person1 is: $1650.0

No bonus for Q1
Quarter 2 Bonus: 270.0
Quarter 3 Bonus: 300.0
Quarter 4 Bonus: 510.0
Annual bonus is: 2100.0
Total bonus for person2 is: $3180.0

 **/


public class BonusOnSavings {

    /**
     The method has 5 parameters, all of type double : commit, q1,q2,q3,q4.
     The method calculates the amount of bonuses someone will get if they
     save a certain amount of money. If they save more than the quarterly commitment, they get a 3%
     quarterly bonus on those quarters. If they save more than the annual commitment, they get a 5%
     annual bonus for the year. If they save more than 25% higher than the annual commitment, they get
     a 25% annual bonus.
     **/

    public static double computeBonus (double commit, double q1, double q2, double q3, double q4) {

        double quarterCommit = commit * 3, annualCommit = commit * 12;
        double quarterlyBonus1 = 0, quarterlyBonus2 = 0, quarterlyBonus3 = 0, quarterlyBonus4 = 0;
        double annualBonus = 0;




        if (q1 >= quarterCommit) {
            quarterlyBonus1 = q1 * 0.03;
            System.out.println("Quarter 1 Bonus: " + quarterlyBonus1);
        } else {
            System.out.println("No bonus for Q1");
        }
        if (q2 >= quarterCommit) {
            quarterlyBonus2 = q2 * 0.03;
            System.out.println("Quarter 2 Bonus: " + quarterlyBonus2);
        } else {
            System.out.println("No bonus for Q2");
        }
        if (q3 >= quarterCommit) {
            quarterlyBonus3 = q3 * 0.03;
            System.out.println("Quarter 3 Bonus: " + quarterlyBonus3);
        } else {
            System.out.println("No bonus for Q3");
        }
        if (q4 >= quarterCommit) {
            quarterlyBonus4 = q4 * 0.03;
            System.out.println("Quarter 4 Bonus: " + quarterlyBonus4);
        } else {
            System.out.println("No bonus for Q4");
        }





        if ((q1 + q2 + q3 + q4) >= annualCommit * 1.25) {
            annualBonus = (q1 + q2 + q3 + q4)* 0.25;
            System.out.println("25% Annual Bonus is: " + annualBonus);
        }else if ((q1 + q2 + q3 + q4) >= annualCommit) {
            annualBonus = ((q1 + q2 + q3 + q4) * 0.05);
            System.out.println("Annual bonus is: " + annualBonus);
        } else {
            System.out.println("Error");
        }

        // The quarterly and annual bonuses are added up and returned to the method
        // to display the result of the bonus calculations.

        double totalQuarterlyBonus = quarterlyBonus1 + quarterlyBonus2 + quarterlyBonus3 + quarterlyBonus4;
        double combinedBonus = totalQuarterlyBonus + annualBonus;
        return combinedBonus;
    }
}

