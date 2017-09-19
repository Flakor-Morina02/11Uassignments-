
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
        City Ontario = new City() ;
        
        // create a robot
        Robot bob = new Robot(Ontario, 3, 0, Direction.EAST); 
        
         // Create a wall
        new Wall(Ontario, 3, 2, Direction.WEST);
        new Wall(Ontario, 3, 2, Direction.NORTH);
        new Wall(Ontario, 2, 3, Direction.WEST);
        new Wall(Ontario, 1, 3, Direction.WEST);
        new Wall(Ontario, 1, 3, Direction.NORTH);
        new Wall(Ontario, 1, 3, Direction.EAST);
        new Wall(Ontario, 2, 4, Direction.NORTH);
        new Wall(Ontario, 2, 4, Direction.EAST);
        new Wall(Ontario, 3, 4, Direction.EAST);
      
        //Create Object
      
         new Thing (Ontario, 3, 1);
        
          // the way the robot is moving
         bob.move() ;
         bob.pickThing();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.turnLeft();
         bob.move();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         bob.putThing();
         bob.move();
         bob.turnLeft();
         bob.turnLeft();
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
