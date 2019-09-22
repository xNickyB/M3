package com.codebind;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JButton;
//import javax.swing.JPanel;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
//import javax.swing.JRadioButton;
//import javax.swing.ButtonGroup;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigScreen extends JFrame implements ActionListener{
    private JPanel ConfigPanel = new JPanel(new BorderLayout());
    //private JButton ConfigButton;
    private JLabel Config;
    private JTextField enterName;
    private JRadioButton easy;
    private JRadioButton medium;
    private JRadioButton hard;
    private ButtonGroup levels;

    public String name;
    public int skill;

    public ConfigScreen() {
        super("Configuration"); //config page
        setSize(800,600);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //ConfigButton = new JButton("Enter Space...");
        Config = new JLabel("What's Your Name?: ");
        enterName = new JTextField(10);
        name = enterName.getText();

        easy = new JRadioButton("Easy");
        if (easy.isSelected()) {
            skill = 100;
        }
        //easy.addActionListener();
        medium = new JRadioButton("Medium");
        if (medium.isSelected()) {
            skill = 50;
        }
        //easy.addActionListener();
        hard = new JRadioButton("Hard");
        if (hard.isSelected()) {
            skill = 15;
        }
        //easy.addActionListener();
        levels = new ButtonGroup();
        levels.add(easy);
        levels.add(medium);
        levels.add(hard);
        //ConfigPanel.add(ConfigButton);
        ConfigPanel.add(Config);
        ConfigPanel.add(enterName);

        ConfigPanel.setBackground(Color.YELLOW);
        add(ConfigPanel);
        setVisible(true);


    }
    public static void main(String[] args) {
        new ConfigScreen();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
