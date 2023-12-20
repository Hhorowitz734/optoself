package com.optoself;

import javax.swing.*;

import view.ButtonPanel;

import java.awt.*;
import java.awt.Image;

public class Main {

     private static void createAndShowGUI() {
        JFrame frame = new JFrame("Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] options = {"Choice 1", "Choice 2", "Choice 3", "Choice 4"};
        ButtonPanel buttonPanel = new ButtonPanel(options);

        frame.add(buttonPanel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Use SwingUtilities to ensure that GUI creation is handled in the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
