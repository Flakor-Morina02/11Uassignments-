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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // scanner is put in 
        Scanner input = new Scanner(System.in);
        //telling the system to ask for the different prices of items 
        System.out.println("please insert Food cost");
        int FoodCost = input.nextInt();
        System.out.println("please insert DJ cost");
        int DJ = input.nextInt();
        System.out.println("please insert Hall rent cost");
        int HallRent = input.nextInt();
        System.out.println("please insert Decoration cost");
        int DecoreCost = input.nextInt();
        System.out.println("please insert Staff cost");
        int StaffCost = input.nextInt();
        System.out.println("please insert Miscellaneous cost");
        int MisCoat = input.nextInt();
        //finding the total cost of all the items and what you need to break even
        double Total = FoodCost + DJ + HallRent + DecoreCost + StaffCost + MisCoat;
        double FullTotal = Total / 35;
        FullTotal = Math.ceil(FullTotal);
        System.out.println("The total cost " + Total + "you will need to sell" + FullTotal + "to break even");


    }
}
