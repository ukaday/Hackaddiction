import javax.swing.*;
import java.awt.event.*;

public class MazeSlide{
    
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

    /*int[][] slide = {
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0, 0, 1, 0, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1, 0, 0, 0, 0, 1},
        {1, 0, 1, 0, 1, 0, 1, 1, 0, 1},
        {1, 0, 1, 1, 1, 0, 1, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

        
    MazeSlide maze1 = new MazeSlide(slide);

    maze1.printMaze(); */

  
}
