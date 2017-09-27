/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author morif9929
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
     City Ontario = new City();
     
     
      // create a robot
        Robot bob = new Robot(Ontario, 1, 2, Direction.WEST);
    
          
        while(bob.getStreet()>=1) {
        bob.move();
        while(bob.getDirection()!=Direction.NORTH)
            bob.turnLeft();
    }
    if(bob.getAvenue()>=1) {
        bob.turnLeft();
        bob.move();
    }
    while(bob.getAvenue()>=1)
        bob.move();
       
               
            }
        
        
        
       
    
    
}
