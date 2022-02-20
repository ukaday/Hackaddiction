import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame{
    public Frame() {
        this.add(new Panel());
        this.setTitle("Maze");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.black);
    }
}