package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpaceTrade {
    private JPanel WelcomePanel;
    private JButton WelcomeButton;

    public SpaceTrade() {
        WelcomeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //link this button to next screen
                //JOptionPane.showMessageDialog(null, "Let's start the game!");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SpaceTrade");
        frame.setContentPane(new SpaceTrade().WelcomePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
