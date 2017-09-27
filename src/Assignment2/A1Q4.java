/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author morif9929
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Ontario = new City();
     
     
      // create a robot
        Robot bob = new Robot(Ontario, 0, 0, Direction.NORTH);
        
        //new walls
        new Wall(Ontario, 1, 1, Direction.WEST);
        new Wall(Ontario, 1, 1, Direction.NORTH);
        new Wall(Ontario, 1, 1, Direction.EAST);
        new Wall(Ontario, 1, 1, Direction.SOUTH);
        new Wall(Ontario, 1, 4, Direction.WEST);
        new Wall(Ontario, 1, 4, Direction.EAST);
        new Wall(Ontario, 1, 4, Direction.NORTH);
        new Wall(Ontario, 1, 4, Direction.SOUTH);
        new Wall(Ontario, 4, 1, Direction.EAST);
        new Wall(Ontario, 4, 1, Direction.WEST);
        new Wall(Ontario, 4, 1, Direction.NORTH);
        new Wall(Ontario, 4, 1, Direction.SOUTH);
        new Wall(Ontario, 4, 4, Direction.WEST);
        new Wall(Ontario, 4, 4, Direction.NORTH);
        new Wall(Ontario, 4, 4, Direction.EAST);
        new Wall(Ontario, 4, 4, Direction.SOUTH);
        new Wall(Ontario, 2, 2, Direction.WEST);
        new Wall(Ontario, 3, 2, Direction.WEST);
        new Wall(Ontario, 3, 2, Direction.SOUTH);
        new Wall(Ontario, 3, 3, Direction.SOUTH);
        new Wall(Ontario, 3, 3, Direction.EAST);
        new Wall(Ontario, 2, 3, Direction.EAST);
        new Wall(Ontario, 2, 2, Direction.NORTH);
        new Wall(Ontario, 2, 3, Direction.NORTH);
       
        //robot gaurding and walking around the castle
        while(true) {
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.move();
            bob.turnLeft();
            bob.turnLeft();
            bob.turnLeft();
            bob.move();
            bob.move();
            
         
   }
 }
      
 }
         
    

    

