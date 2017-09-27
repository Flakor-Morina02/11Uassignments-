
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

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
           City Ontario = new City() ;
           
            // create a robot
        Robot bob = new Robot(Ontario, 0, 0, Direction.EAST); 
          
           // create a second robot named joe
         Robot joe = new Robot(Ontario, 0, 1, Direction.WEST);
    
           //new wall
         new Wall(Ontario, 0, 0, Direction.EAST);
         new Wall(Ontario, 1, 0, Direction.EAST);
         new Wall(Ontario, 1, 1, Direction.SOUTH);
         
         // Bob and joe movement
         bob.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         joe.turnLeft();
         bob.move();
         joe.move();
         joe.turnLeft();
         joe.turnLeft();
         joe.turnLeft();
         joe.turnLeft();
         joe.turnLeft();
         joe.move();
         bob.move();
         joe.turnLeft();
         joe.turnLeft();
         joe.turnLeft();
         joe.move();
         bob.turnLeft();
         joe.turnLeft();
         bob.turnLeft();
         joe.turnLeft();
         bob.turnLeft();
         joe.turnLeft();
         bob.turnLeft();
         bob.turnLeft();
         bob.move();
         joe.move();
         
         
         
         
         
        
         
         
         
         
         
        
       
        
    }
}
