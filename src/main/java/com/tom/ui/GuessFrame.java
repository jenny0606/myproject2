package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {

    //Fields
    //Constructors
    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button=new JButton("Hi");
        JLabel label=new JLabel("ZZzz...");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Hello!");
            }
        });
        add(button);
        add(label);
        setLayout(new FlowLayout());
        setVisible(true);

    }
    //Methods

    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
        //guessFrame.setVisible(true);
        //guessFrame.setSize(600, 400);

    }

}
