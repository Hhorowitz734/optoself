package com.optoself.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class ButtonPanel extends JPanel {

    public ButtonPanel(String[] options) {
        // Check if exactly 4 options are provided
        if (options.length != 4) {
            throw new IllegalArgumentException("Exactly 4 options are required.");
        }

        // Set the layout for the panel
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        // Create and add buttons based on the options
        for (String choice : options) {
            JButton button = new JButton(choice);
            Dimension buttonSize = new Dimension(150, 40); // Width x Height
            button.setPreferredSize(buttonSize);
            add(button);
        }
    }

    private void initialize() {
        // Additional initialization can be done here if needed
    }
}
