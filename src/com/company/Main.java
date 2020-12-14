package com.company;

//TODO: 50.    Să se calculeze înălțimea unui arbore și să se insereze valoarea respectivă în locul tuturor valorilor nule din arbore.
//TODO: (valorilor 0).

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUI_Form ProjectGUIForm = new GUI_Form();
                ProjectGUIForm.setVisible(true);
            }
        });
    }
}
