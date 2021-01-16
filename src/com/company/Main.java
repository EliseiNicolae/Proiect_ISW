package com.company;
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
