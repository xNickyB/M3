package com.codebind;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurationScreen1 {
    private JLabel nameLabel;
    private JTextField nameField;
    private JPanel Panel;
    private JButton hardButton;
    private JButton mediumButton;
    private JButton easyButton;
    private JLabel difficultyLabel;
    private JTextField pilotAlc;
    private JTextField fighterAlc;
    private JTextField merchantAlc;
    private JTextField engineerAlc;
    private JButton submitPointsButton;

    protected String name;
    protected int skill;
    protected int pilotPoints;
    protected int fighterPoints;
    protected int merchantPoints;
    protected int engineerPoints;
    protected String merchanttext;
    protected String pilottext;
    protected String engineertext;
    protected String fightertext;

    public ConfigurationScreen1() {
        easyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (easyButton.isSelected()) {
                    skill = 100;
                    JOptionPane.showMessageDialog(null, "You have 100 points to allocate; Changing difficulty changes point numbers.");
                }
            }
        });
        mediumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mediumButton.isSelected()) {
                    skill = 50;
                    JOptionPane.showMessageDialog(null, "You have 50 points to allocate; Changing difficulty changes point numbers.");
                }
            }
        });
        hardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (hardButton.isSelected()) {
                    skill = 15;
                    JOptionPane.showMessageDialog(null, "You have 15 points to allocate; Changing difficulty changes point numbers.");
                }
            }
        });
        pilotAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilottext = pilotAlc.getText();
                pilotPoints = Integer.parseInt(pilottext);
            }
        });
        fighterAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fightertext = fighterAlc.getText();
                fighterPoints = Integer.parseInt(fightertext);
            }
        });
        merchantAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                merchanttext = merchantAlc.getText();
                merchantPoints = Integer.parseInt(merchanttext);
            }
        });
        engineerAlc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                engineertext = engineerAlc.getText();
                engineerPoints = Integer.parseInt(engineertext);
            }
        });

        submitPointsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int total = engineerPoints + merchantPoints + fighterPoints + pilotPoints;
                if (total > skill) {
                    JOptionPane.showMessageDialog(null, "Your points total exceeds the number of available points for the chosen difficulty. Please enter new points");
                } else {
                    JOptionPane.showMessageDialog(null, "Your points did not exceed the number of available points! Good luck in the game.");
                }
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("ConfigurationScreen");
        frame.setContentPane(new ConfigurationScreen1().Panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }


}

