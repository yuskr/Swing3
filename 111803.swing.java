package com.lazypck;

import javax.swing.*;

public class App {
    private JPanel mypanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,200,300,300);
        frame.setVisible(true);
    }


}
