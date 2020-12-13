package com.company;

//TODO: 50.    Să se calculeze înălțimea unui arbore și să se insereze valoarea respectivă în locul tuturor valorilor nule din arbore.
//TODO: (valorilor 0).

import javax.swing.*;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
//        Arbore arbore1 = new Arbore();
//        arbore1.insert(10);
//        arbore1.insert(18);
//        arbore1.insert(0);
//        arbore1.insert(5);
//        arbore1.insert(0);
//        arbore1.insert(0);
//        arbore1.insert(16);
//        arbore1.insert(0);
//        arbore1.insert(2);
//
//
//        System.out.println("Arbore inainte: ");
//        Arbore arbore2Replica = arbore1;
//        arbore2Replica.RSD(arbore2Replica.root);
//
//        System.out.println("------- -------- -------- ------- -------- --------");
//        int inaltimeArbore =  arbore2Replica.inaltimeArbore(arbore2Replica.root);
//        System.out.println("Inaltime arbore: " + inaltimeArbore);
//        System.out.println("------- -------- -------- ------- -------- --------");
//        System.out.println("Arbore dupa: ");
//        arbore2Replica.inserareVLRN(arbore1.root, inaltimeArbore);
//        arbore2Replica.RSD(arbore2Replica.root);

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
