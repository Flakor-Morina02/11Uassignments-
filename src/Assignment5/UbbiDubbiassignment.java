/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author morif9929
 */
public class UbbiDubbiassignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int x = 0;

        while (x < 1) {

             // a new scanneer to get the word needed
            System.out.print("Please enter the word you would like to be translated: ");

            Scanner words = new Scanner(System.in);

            String word = words.nextLine();

            String ex = "Exit";

         
           //easy wat to exit the system 
         
            if (word.equals(ex)) {

                System.out.print("goodbye");

                break;


            }
           
             //looking for a vowel at spot 1
            String translate = "";

            Boolean foundvowel = false;

            for (int i = 0; i < word.length(); i++) {

                      
                if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == false) {

                    translate = translate + "ub";

                    translate = translate + word.charAt(i);

                    foundvowel = true;


                } else {
 
                       //find the first vowel needed
                    if ((word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') && foundvowel == true) {
                        translate = translate + word.charAt(i);

                        //double vowels
                    } else {
                        translate = translate + word.charAt(i);
                        foundvowel = false;
                    }
                }

            }
              //final message    
            System.out.print(translate);
            x = x + 1;


        }
    }
}
