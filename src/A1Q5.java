
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City Ontario = new City() ;
         
           // create a robot
        Robot bob = new Robot(Ontario, 0, 1, Direction.WEST); 
         
        
        
        //place label on bob
       
          bob.setLabel("bob");
       
        
           
          // create a second robot named joe
        Robot joe = new Robot(Ontario, 3, 3, Direction.EAST);
         
        
        //place label on joe
          
          joe.setLabel("joe");
         //Create Object
      
         new Thing (Ontario, 0, 0);
         new Thing (Ontario, 1, 0);
         new Thing (Ontario, 1, 1);
         new Thing (Ontario, 1, 2);
         new Thing (Ontario, 2, 2);
         
        
        
        
        
          //new wall
         new Wall(Ontario, 2, 3, Direction.WEST);
         new Wall(Ontario, 2, 3, Direction.NORTH);
         new Wall(Ontario, 2, 3, Direction.EAST);
         new Wall(Ontario, 3, 3, Direction.EAST);
         new Wall(Ontario, 3, 3, Direction.SOUTH);
         
         //Bob and Joe Movements
         joe.turnLeft();
         joe.turnLeft();
         joe.move();
         bob.move();
         bob.pickThing();
         bob.turnLeft();
         bob.move();
         joe.turnLeft();
         joe.turnLeft();
         joe.turnLeft();
         bob.turnLeft();
         bob.pickThing();
         bob.move();
         bob.pickThing();
         joe.move();
         joe.pickThing();
         joe.move();
         joe.pickThing();
         joe.turnLeft();
         
         
         
          
         
    }
}
