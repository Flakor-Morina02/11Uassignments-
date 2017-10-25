/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //scanner is put in
        Scanner input = new Scanner(System.in);
        //telling the system to ask for the persons name and figuring out how much the test wqas out of and the mark
        System.out.println("Please enter your name");
        String firstName = input.nextLine();
        System.out.println("Hello" + firstName);

        System.out.println("What is the first test out of");
        double Q1 = input.nextInt();
        System.out.println("What mark did you get");
        double A1 = input.nextInt();

        System.out.println("What is the second test out of");
        double Q2 = input.nextInt();
        System.out.println("What mark did you get");
        double A2 = input.nextInt();

        System.out.println("What is the third test out of");
        double Q3 = input.nextInt();
        System.out.println("What mark did you get");
        double A3 = input.nextInt();

        System.out.println("What is the foruth test out of");
        double Q4 = input.nextInt();
        System.out.println("What mark did you get");
        double A4 = input.nextInt();

        System.out.println("What is the fifth test out of");
        double Q5 = input.nextInt();
        System.out.println("What mark did you get");
        double A5 = input.nextInt();
        //finding the percentage for each test and average
        double QA1 = A1 / Q1 * 100;
        double QA2 = A2 / Q2 * 100;
        double QA3 = A3 / Q3 * 100;
        double QA4 = A4 / Q4 * 100;
        double QA5 = A5 / Q5 * 100;
        double Average = QA1 + QA2 + QA3 + QA4 + QA5;
        double AveragePercentage = Average / 5;
        System.out.println("Test scores for " + firstName);
        System.out.println("Test 1" + QA1 + "%");
        System.out.println("Test 2" + QA2 + "%");
        System.out.println("Test 3" + QA3 + "%");
        System.out.println("Test 4" + QA4 + "%");
        System.out.println("Test 5" + QA5 + "%");
        System.out.println("Your Average is" + AveragePercentage + "%");







    }
}
