/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.City;





/**
 *
 * @author morif9929
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ontario = new City() ;
        
        // create a robot
        Robot bob = new Robot(Ontario, 0, 2, Direction.WEST); 
        
        // Create a wall
    new Wall(Ontario, 0, 2, Direction.SOUTH);
    new Wall(Ontario, 0, 1, Direction.SOUTH);
    new Wall(Ontario, 1, 1, Direction.WEST);
    new Wall(Ontario, 2, 1, Direction.WEST);
    new Wall(Ontario, 3, 1, Direction.NORTH);
    new Wall(Ontario, 3, 2, Direction.NORTH);
    new Wall(Ontario, 2, 2, Direction.EAST);
    new Wall(Ontario, 1, 2, Direction.EAST);
   
    
        // the way the robot is moving
    bob.move() ;
    bob.move() ;
    bob.turnLeft();
    bob.move();
    bob.move();
    bob.move();
    bob.turnLeft();
    bob.move();
    bob.move();
    bob.move();
    bob.turnLeft();
    bob.move();
    bob.move();
    bob.move();
   
    
    
    }
}
