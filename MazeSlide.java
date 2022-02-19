import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MazeSlide{
    
    int[][] maze;
    int mazeSize;

    public MazeSlide(int[][] m) {
        maze = m;
        mazeSize = m.length;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        int y = 0;
        for (int i = 0; i < mazeSize; i++) {
            int x = 0;
            for (int j = 0; j < mazeSize; j++) {
                if (maze[i][j] == 1)
                    g.fillRect(x, y, 20, 20);
                x += 20;
            }
            y += 20;
        }
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
}
