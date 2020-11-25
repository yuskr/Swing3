package com.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App02 {
    private JPanel mypanel = new JPanel();
    private JTextArea tareaA =new JTextArea();
    private JTextArea tareaB = new JTextArea();
    private JLabel my_label = new JLabel();


    public App02(){
        tareaA.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if ((e.getKeyCode() == KeyEvent.VK_ENTER)){
                    if (tareaA.getText().equals("小赖") ){
                        tareaB.append("没错，小赖才是世界上最帅的！");
                    }else {
                        tareaB.setText("不，ta是最丑的！");
                    }
                }

            }
        });
    }

    void go(){
        JFrame frame = new JFrame("墨镜");
        mypanel.setLayout(null);
        tareaA.setBounds(50,50,400,100);
        tareaB.setBounds(50,200,400,100);
        my_label.setBounds(50,10,200,100);

        tareaA.setText("谁是世界上最帅的人？");
        tareaA.setBackground(Color.green);
        tareaB.setBackground(Color.yellow);

        mypanel.add(my_label);
        mypanel.add(tareaA);
        mypanel.add(tareaB);

        frame.setContentPane(mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,520);
        //frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new App02().go();
    }

}
