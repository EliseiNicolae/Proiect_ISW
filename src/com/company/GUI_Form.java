package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Form extends JFrame {
    private JPanel rootPanel;
    private JPanel problemInterface;
    private JButton dumitruAndreiValentinButton;
    private JButton aldescuAlinButton;
    private JButton harcanAdrianButton;
    private JButton carstoceaCosminMarianButton;
    private JButton mihalacheDavidAlexandruButton;
    private JButton miloiuMarianIulianButton;
    private JButton nicolaeEliseiButton;
    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton baciuAlexandruButton;
    private JLabel studentName;
    private JLabel descriptionStudentName;
    private JLabel descriptionNameProblem;
    private JLabel problemName;
    private JLabel inputDescription;
    private JLabel outputDescription;
    private JButton submitButton;
    private JPanel menuStudents;
    private JButton backToMenuButton;


    public GUI_Form(){

        add(rootPanel);

        setTitle("ISW Program");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hideProblemPanel();
        menuStudents.setVisible(true);

        nicolaeEliseiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Nicolae Elisei");
                problemName.setText("50.    Să se calculeze înălțimea unui arbore și să să insereze valoarea respectivă în locul tuturor valorilor nule din arbore.");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String textInput = inputTextArea.getText();
                        System.out.println("textInput = " + textInput);
//                        Arbore arbore1 = new Arbore();
                    }
                });

            }
        });

        dumitruAndreiValentinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Dumitru Andrei Valentin");
                problemName.setText("numar problema Andrei");
                openProblemPanel();
            }
        });


        aldescuAlinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Aldescu Alin");
                problemName.setText("Nr prb Alin");
                openProblemPanel();
            }
        });


        harcanAdrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Harcan Adrian");
                problemName.setText("Nr prb Adrian");
                openProblemPanel();
            }
        });


        carstoceaCosminMarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Carstocea Cosmin Marian");
                problemName.setText("Nr prb Cosmin");
                openProblemPanel();
            }
        });

        mihalacheDavidAlexandruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Mihalache David Alexandru");
                problemName.setText("Nr prb David");
                openProblemPanel();
            }
        });


        miloiuMarianIulianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Miloiu Marian Iulian");
                problemName.setText("Nr prb Iulian");
                openProblemPanel();
            }
        });
        baciuAlexandruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Baciu Alexandru");
                problemName.setText("Nr prb Alexandru");
                openProblemPanel();
            }
        });
        backToMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hideProblemPanel();
                openMenuPanel();
            }
        });
    }

    public void openProblemPanel(){
        problemInterface.setVisible(true);
        hideMenuPanel();
    }

    public void hideProblemPanel(){
        inputTextArea.setText("");
        outputTextArea.setText("");
        problemInterface.setVisible(false);
    }

    public void openMenuPanel(){
        menuStudents.setVisible(true);
    }

    public void hideMenuPanel(){
        menuStudents.setVisible(false);
    }
}
