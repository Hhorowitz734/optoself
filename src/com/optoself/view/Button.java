package com.optoself.view;

import javax.swing.JButton;
import java.awt.Dimension;

public class Button extends JButton {

    private String choice;

    public Button(String label, Dimension dims) {
        super(label); 
        this.choice = label;
        this.setPreferredSize(dims); 
    }
}
