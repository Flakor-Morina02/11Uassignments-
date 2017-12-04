/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new scanner
        Scanner input = new Scanner(System.in);
        //asking how many students atttend the class
        System.out.println("How many students are in the class");
        int students = input.nextInt();

        System.out.println("Input" + students + "marks:");
        int[] currency = new int[students];
        for (int i = 0; i < currency.length; i++) {
            currency[i] = input.nextInt();
        }

        for (int i = 0; i < currency.length; i++) {
            for (int x = 1; x < currency.length; x++) {
                if (currency[x - 1] > currency[x]) {
                    int temp = currency[x - 1];
                    currency[x - 1] = currency[x];
                    currency[x] = temp;

                }
            }
        }

        double median = 0;
        double medianOne = 0;
        double medianTwo = 0;


        double sum = 0;
        for (int i = 0; i < currency.length; i++) {
            sum = sum + currency[i];

        }



        double average = sum / currency.length;

        for (int i = 0; i < students; i++) {
            if (currency[i] > average) {
            }
        }

        if (currency.length % 2 == 0) {
            median = students / 2;
            double flakor = currency[(int) median - 1];
            double wall = currency[(int) median];
            double bob = flakor + wall;
            double joe = bob / 2;

            System.out.println("The median mark is " + joe);
        } else {
            int total = currency.length / 2;
            System.out.println("The median mark is " + currency[total]);

        }

        System.out.println("The Average is " + average);
    }
}
