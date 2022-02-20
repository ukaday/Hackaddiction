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

    //player is stored in array as integer 2
    public void addPlayer(int x, int y) {
        maze[y][x] = 2;
    }

    //takes x and y, turns back to 0
    public void removePlayer(int x, int y) {
        maze[y][x] = 0;
    }

    //checks if a postion is a 1 or 0 
    public boolean possibleMove(int x, int y) {
        if (maze[y][x] == 1) {
            return false;
        }
        return true;
    }

    public int getMazeSize() {
        return mazeSize;
    }

    public boolean containsPlayer() {
        for (int[] row : maze) {
            for (int col : row) {
                if (col == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void draw(Graphics g) {
        int y = 0;
        for (int i = 0; i < mazeSize; i++) {
            int x = 0;
            for (int j = 0; j < mazeSize; j++) {
                if (maze[i][j] == 1) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 25, 25);
                }
                else if (maze[i][j] == 2) {
                    g.setColor(Color.CYAN);
                    g.fillRect(x, y, 25, 25);
                }
                x += 25;
            }
            y += 25;
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