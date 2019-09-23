package com.codebind;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

class DisplayScreen {
    public JPanel Panel;
    private JPanel WelcomePanel;
    private JButton WelcomeButton;
    private JLabel WelcomeSign;
    public static JFrame frame;
    public static JFrame display;


    private JLabel nameLabel;
    private JTextField nameField;
    private JButton hardButton;
    private JButton mediumButton;
    private JButton easyButton;
    private JLabel difficultyLabel;
    private JTextField pilotAlc;
    private JTextField fighterAlc;
    private JTextField merchantAlc;
    private JTextField engineerAlc;
    private JButton submitPointsButton;

    //protected String name;
    protected int skill;
    protected int pilotPoints;
    protected int fighterPoints;
    protected int merchantPoints;
    protected int engineerPoints;
    protected String merchanttext;
    protected String pilottext;
    protected String engineertext;
    protected String fightertext;
    public String name;

    public JPanel title;
    protected JLabel profile;

    public DisplayScreen() {

    }




}
