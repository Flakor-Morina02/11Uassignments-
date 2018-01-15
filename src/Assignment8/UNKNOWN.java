/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment8;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author morif9929
 */
public class UNKNOWN extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    //Title of the window
    String title = "My Game";

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // YOUR GAME VARIABLES WOULD GO HERE

    int paddleHeight = 15;
    int paddleWidth = 15;
    Rectangle biker1 = new Rectangle(50, HEIGHT/2 - paddleHeight/2, 
                                        paddleWidth, paddleHeight);
    Rectangle biker2 = new Rectangle(WIDTH - 40 - paddleWidth, HEIGHT/2 - paddleHeight/2, 
                                        paddleWidth, paddleHeight);
    
    boolean biker1Up = false;
    boolean biker1Down = false;
    boolean biker1Right = false;
    boolean biker1Left = false;
    boolean biker2Up = false;
    boolean biker2Down = false;
    boolean biker2Right = false;
    boolean biker2Left = false;
    
    
    int gameSpeed= 1;
    Font biggerfont = new Font("arial", Font.BOLD, 42);  
  
    // GAME VARIABLES END HERE   

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public UNKNOWN(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }
    
    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);
        g.setColor(Color.RED);
        g.fillRect(0, 0, WIDTH-780, HEIGHT);
        g.fillRect(0, 0, WIDTH, HEIGHT-580);
        g.fillRect(0, HEIGHT-20, WIDTH, HEIGHT - 580);
        g.fillRect(WIDTH-20, 0, WIDTH-780, HEIGHT);
        g.setColor(Color.blue);
        g.fillRect(biker1.x, biker1.y, biker1.width, biker1.height);
        g.fillRect(biker2.x, biker2.y, biker2.width, biker2.height);
        g.setColor(Color.BLACK);
        g.setFont(biggerfont);
        if (biker1.y >= HEIGHT - 40 || biker1.y <= 15 || biker1.x >= WIDTH - 40 || biker1.x <= 15) {
            g.clearRect(0, 0, WIDTH, HEIGHT);
            g.drawString("Game Over, P2 WINS!", WIDTH/ 2 - 200, HEIGHT / 2);
        }
         if (biker2.y >= HEIGHT - 40 || biker2.y <= 15 || biker2.x >= WIDTH - 40 || biker2.x <= 15) {
            g.clearRect(0, 0, WIDTH, HEIGHT);
            g.drawString("Game Over P1 WINS!", WIDTH/ 2 - 200, HEIGHT / 2);
            
        // GAME DRAWING ENDS HERE
    }
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here

       
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
              if (biker1Up) {
            biker1.y = biker1.y - 5;
        } 
              if (biker1Down) {
            biker1.y = biker1.y + 5;
        }
        if (biker1Right) {
            biker1.x = biker1.x + 5;
        } 
        if (biker1Left) {
            biker1.x = biker1.x - 5;
        }
            
        if (biker2Up) {
            biker2.y = biker2.y - 5;
        } if (biker2Down) {
            biker2.y = biker2.y + 5;
        }
        if (biker2Right) {
            biker2.x = biker2.x + 5;
        } if (biker2Left) {
            biker2.x = biker2.x - 5;
        }
        
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e){
            
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
            int key = e.getKeyCode();
        
         if (key == KeyEvent.VK_W) {
             biker1Up = true;
         }  if (key == KeyEvent.VK_S){
             biker1Down = true;
         }
         if (key == KeyEvent. VK_D) {
             biker1Right = true;
         }  if (key == KeyEvent.VK_A) {
             biker1Left = true;
            
        }
          if (key == KeyEvent.VK_UP) {
             biker2Up = true;
         }  if (key == KeyEvent.VK_DOWN){
             biker2Down = true;
         }
         if (key == KeyEvent. VK_RIGHT) {
             biker2Right = true;
         }  if (key == KeyEvent.VK_LEFT) {
             biker2Left = true;
        }
        }
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
              
            int key = e.getKeyCode();
               if (key == KeyEvent.VK_W) {
             biker1Up = false;
         }  if (key == KeyEvent.VK_S){
             biker1Down = false;
         }
         if (key == KeyEvent. VK_D) {
             biker1Right = false;
         }  if (key == KeyEvent.VK_A) {
             biker1Left = false;
         }
               if (key == KeyEvent.VK_UP) {
             biker2Up = false;
         }  if (key == KeyEvent.VK_DOWN){
             biker2Down = false;
         }
         if (key == KeyEvent. VK_RIGHT) {
             biker2Right = false;
         }  if (key == KeyEvent.VK_LEFT) {
             biker2Left = false;
            
        }
    }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        UNKNOWN game = new UNKNOWN();
                
        // starts the game loop
        game.run();
    }
}


