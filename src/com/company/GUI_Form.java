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


    public GUI_Form(){

        add(rootPanel);

        setTitle("ISW Program");
        setSize(1200, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        studentName.setText("");
        studentName.setText("               ");
        problemName.setText("               ");
        descriptionNameProblem.setText("Cerinta problema:");
        descriptionNameProblem.setVisible(false);
        descriptionStudentName.setText("Nume student:");
        descriptionStudentName.setVisible(false);
        inputTextArea.setVisible(false);
        outputTextArea.setVisible(false);
        inputDescription.setVisible(false);
        outputDescription.setVisible(false);

        nicolaeEliseiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Nicolae Elisei");
                problemName.setText("50.    Să se calculeze înălțimea unui arbore și să să insereze valoarea respectivă în locul tuturor valorilor nule din arbore.");
                setPanelVisible();
            }
        });

        dumitruAndreiValentinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Dumitru Andrei Valentin");
                problemName.setText("numar problema Andrei");
                setPanelVisible();
            }
        });


        aldescuAlinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Aldescu Alin");
                problemName.setText("Nr prb Alin");
                setPanelVisible();
            }
        });


        harcanAdrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Harcan Adrian");
                problemName.setText("Nr prb Adrian");
                setPanelVisible();
            }
        });


        carstoceaCosminMarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Carstocea Cosmin Marian");
                problemName.setText("Nr prb Cosmin");
                setPanelVisible();
            }
        });

        mihalacheDavidAlexandruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Mihalache David Alexandru");
                problemName.setText("Nr prb David");
                setPanelVisible();
            }
        });


        miloiuMarianIulianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Miloiu Marian Iulian");
                problemName.setText("Nr prb Iulian");
                setPanelVisible();
            }
        });
        baciuAlexandruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Baciu Alexandru");
                problemName.setText("Nr prb Alexandru");
                setPanelVisible();
            }
        });
    }

    public void setPanelVisible(){
        descriptionNameProblem.setVisible(true);
        descriptionStudentName.setVisible(true);
        inputTextArea.setVisible(true);
        outputTextArea.setVisible(true);
        inputDescription.setVisible(true);
        outputDescription.setVisible(true);
    }
}
