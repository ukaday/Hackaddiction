import javax.swing.*;
import java.awt.event.*;

public class MazeSlide implements KeyListener, Runnable{
    
    int[][] maze;
    int mazeSize;

    public MazeSlide(int[][] m) {
        maze = m;
        mazeSize = m.length;
    }

    public void printMaze() {
        for (int i = 0; i < mazeSize; i++) {
            String line = "";
            for (int j = 0; j < mazeSize; j++) {
                if (maze[i][j] == 0)
                    line += " " + " ";
                else {
                    line += "#" + " ";
                }
            }
            System.out.println(line);
        }
    }
  

    public void update() {
    }

    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
        
    }

    @Override
    public void run() {
        while (true) {
            
        }
        
    }
}
