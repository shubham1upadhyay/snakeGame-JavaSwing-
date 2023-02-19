package com.company;

import javax.swing.*;

public class Frame extends JFrame {
    public Frame()
    {
        this.add(new Panel());
        this.setTitle("SnakeGame ==> 2023");
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
    }
}
