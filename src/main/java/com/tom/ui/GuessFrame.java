package com.tom.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;
import java.util.Scanner;

public class GuessFrame extends JFrame {

    //Fields
    JButton button=new JButton("Guess");
    JLabel label=new JLabel("ZZzz...");
    JTextField number=new JTextField(8);
    Random random=new Random();
    int secret= random.nextInt(100)+1;

    //Constructors
    public GuessFrame(){
        super();
        System.out.println("sectet:"+secret);
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              int num=Integer.parseInt(number.getText());
                System.out.println(num);
                if(num>secret){
                    label.setText("Smaller");
                }else if(num<secret){
                    label.setText("Bigger");
                }else{
                    label.setText("Bingo");
                }
                //label.setText("Hello!");
            }
        });
        add(number);
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
