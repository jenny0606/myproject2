package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setSize(600,400);
        frame.setLocation(300,200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JButton button=new JButton("ok");
        //Anonymous class


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hihi");
            }
        });

        //MyActionListener listener=new MyActionListener();
        //button.addActionListener(listener);

        frame.add(button);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        System.out.println("end");
    }
}
