package brickBreaker;

import javax.swing.*;

public class main {

        public static void main(String[] args) {
            //starts and initializes the pop up window that the game will play on.
            //JFrame builds the window and JPanel builds what goes inside the window
            JFrame obj = new JFrame();
            Gameplay gamePlay = new Gameplay();
            obj.setBounds(10, 10, 700, 600);
            obj.setTitle("Breakout Ball");
            obj.setResizable(false);
            obj.setVisible(true);
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.add(gamePlay);
        }
}
