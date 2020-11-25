package com.test;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    private JPanel my_panel=new JPanel();
    private JLabel myKey=new JLabel();
    private JTextArea mytextarea = new JTextArea();



    public App() {
        mytextarea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    mytextarea.append("进入上流社会！\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    mytextarea.setText("进入下下流社会");
                }
            }
        });
    }

    void go(){
        JFrame frame = new JFrame("键盘事件");
        my_panel.setLayout(null);
        myKey.setBounds(50,20,100,100);
        mytextarea.setBounds(50,0,400,400);
        my_panel.add(mytextarea);
        my_panel.add(myKey);

        frame.setContentPane(my_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
