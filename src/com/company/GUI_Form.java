package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

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
    private JTextArea mInput;
    private JTextArea nInput;
    private JTextArea outputTextArea;
    private JButton baciuAlexandruButton;
    private JLabel studentName;
    private JLabel descriptionStudentName;
    private JLabel descriptionNameProblem;
    private JTextArea problemName;
    private JLabel inputDescription;
    private JLabel outputDescription;
    private JButton submitButton;
    private JPanel menuStudents;
    private JButton backToMenuButton;
    public JLabel mLabel;
    private JLabel nLabel;
    private JButton continueButton;
    private JLabel totalLabel;
    private JTextArea fInputData;
    private JLabel f_labelText;

    int m, n, prod;

    public GUI_Form() {

        add(rootPanel);

        setTitle("ISW Program");
        setSize(1500, 700);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        hideProblemPanel();
        menuStudents.setVisible(true);
        problemName.setEditable(false);


        nicolaeEliseiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Nicolae Elisei");
                problemName.setText("50.    Să se calculeze înălțimea unui arbore și să să insereze valoarea respectivă în locul tuturor valorilor nule din arbore.");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultEliseiNicolae();
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
                mInput.setVisible(true);
                nInput.setVisible(true);
                mLabel.setVisible(true);
                nLabel.setVisible(true);
                inputDescription.setVisible(false);
                outputDescription.setVisible(false);
                inputDescription.setText("Introduceți elementele listei: ");
                outputDescription.setText("Matricea rezultată: ");
                inputTextArea.setVisible(false);
                outputTextArea.setVisible(false);
                submitButton.setVisible(false);

                continueButton.setVisible(true);

                studentName.setText("Aldescu Alin");
                problemName.setText("47. Se dă o listă de forma: l: a11 a12 a13 a14.. a1n → a21 a22 a23 a23 ..a2n→... → am1 am2 am3.. amn \n" +
                        ", cu m și n date. Se cere să se construiască matricea asociată care conține m linii și n coloane,\n" +
                        " pe fiecare linie fiind elementele din cîmpurile informație ale uneia din celulele listei,\n" +
                        " astfel prima linie va conține a11 a12 a13 a14.. a1n, a doua a21 a22 a23 a24.. a2n samd.");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultAlinAldescu();
                    }
                });
            }
        });

        harcanAdrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputDescription.setText("Introduceți elementele listei: ");
                outputDescription.setText("A 2-a listă rezultată: ");
                studentName.setText("Harcan Adrian");
                problemName.setText("Se dă o listă de forma l1: x1 y1 → x2 y2 →... → xn yn /, unde yi=f(xi), iar f este o functie oarecare la alegere. \n" +
                        "Se cere să se construiască o a doua listă de forma l2: y1 x1 → y2 x2 →... → yn xn \n" +
                        "f(xi) = xi2\n" +
                        "deci yi = xi2\n" +
                        "Exemplu de lista 1:\n" +
                        "1 : 1 2 2 4 3 6\n" +
                        "Exemplu de lista 2:\n" +
                        "l2: 2 1 4 2 6 3");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setVisibleHarcanInputs(true);
                        showResultHarcanAdrian();
                    }
                });
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
                ActionListener[] curatare = submitButton.getActionListeners();
                for (ActionListener instantaActionListener : curatare) {
                    submitButton.removeActionListener(instantaActionListener);
                }
            }
        });

        continueButton.addActionListener(e -> {
            totalLabel.setVisible(true);
            inputDescription.setVisible(true);
            outputDescription.setVisible(true);
            inputTextArea.setVisible(true);
            outputTextArea.setVisible(true);
            submitButton.setVisible(true);

            String m_input = mInput.getText();
            String n_input = nInput.getText();
            m = Integer.parseInt(m_input);
            n = Integer.parseInt(n_input);
            prod = m * n;

            totalLabel.setText("Introduceti " + prod + " elemente separate prin virgula.");
        });
    }

    public void openProblemPanel() {
        problemInterface.setVisible(true);
        hideMenuPanel();
    }

    public void hideProblemPanel() {
        inputTextArea.setText("");
        outputTextArea.setText("");
        inputDescription.setVisible(true);
        outputDescription.setVisible(true);
        inputTextArea.setVisible(true);
        outputTextArea.setVisible(true);
        submitButton.setVisible(true);
        mInput.setVisible(false);
        nInput.setVisible(false);
        mLabel.setVisible(false);
        nLabel.setVisible(false);
        continueButton.setVisible(false);
        totalLabel.setVisible(false);
        problemInterface.setVisible(false);
        setVisibleHarcanInputs(false);
    }

    public void openMenuPanel() {
        menuStudents.setVisible(true);
    }

    public void hideMenuPanel() {
        menuStudents.setVisible(false);
    }

    public void showResultEliseiNicolae() {
        Arbore arbore = new Arbore();


        // get text from textBox, and insert in the tree
        String textInput = inputTextArea.getText();

        // verify if it contains incorrect characters
        if (textInput.matches(".*[a-z].*") || textInput.contains(" ") || textInput.matches(".*[A-Z].*") || textInput.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // separate numbers, and insert in the tree
        String[] textInputSplit = textInput.split(",");
        for (String s : textInputSplit) {
            arbore.insert(Integer.parseInt(s));
        }

        //get height tree
        int inaltimeArbore = arbore.inaltimeArbore(arbore.root);

        // update contor nods
        arbore.updateRSD(arbore.root);

        // Show in textBox outputs
        outputTextArea.setText("--------------------- Problema 50 ---------------------\n");
        outputTextArea.setText(outputTextArea.getText() + "\n Inaltime arbore: " + inaltimeArbore);
        outputTextArea.setText(outputTextArea.getText() + "\n Arbore inainte: " + arbore.noduriArbore);
        arbore.noduriArbore = "";
        arbore.inserareVLRN(arbore.root, inaltimeArbore);
        outputTextArea.setText(outputTextArea.getText() + "\n Raspuns: " + arbore.updateRSD(arbore.root));
        outputTextArea.setText(outputTextArea.getText() + "\n\n--------------------- Problema 50 ---------------------");
        arbore.noduriArbore = "";
        arbore.contorInaltime = 0;
    }

    public void showResultAlinAldescu() {
//        create a new LinkList
        LinkListAlin theList = new LinkListAlin();

//        get input
        String textInputAlin = inputTextArea.getText();

        if (textInputAlin.matches(".*[a-z].*") || textInputAlin.contains(" ") || textInputAlin.matches(".*[A-Z].*") || textInputAlin.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAlinSplit = textInputAlin.split(",");

//        insert input items in the List
        for (String s : textInputAlinSplit) {
            theList.insertLast(Integer.parseInt(s));
        }

        int[][] matrix = new int[m][n];
        int nr = 1;

//        populate matrix with list items
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = theList.getListItem(nr);
                nr++;
            }
        }

//        output the result
        outputTextArea.setText("--------------------- Problema 47 ---------------------\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                outputTextArea.setText(outputTextArea.getText() + matrix[i][j] + " ");
            }
            outputTextArea.setText(outputTextArea.getText() + "\n");
        }
        outputTextArea.setText(outputTextArea.getText() + "\n--------------------- Problema 47 ---------------------");
    }


    public void showResultHarcanAdrian() {
        LinkListAdrian l1= new LinkListAdrian();
        LinkListAdrian l2= new LinkListAdrian();
        int f;

        /* Get inputs from TextFields */
        try{
            f = Integer.parseInt(fInputData.getText());
        }catch (Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPanel,
                    "Campul 'f' nu a fost completat sau a fost completat gresit. Acest camp trebuie sa contina un singur numar. ",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String textInputAdrian = inputTextArea.getText();

        if (textInputAdrian.matches(".*[a-z].*") || textInputAdrian.contains(" ") || textInputAdrian.matches(".*[A-Z].*") || textInputAdrian.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAdrianSplit = textInputAdrian.split(",");
        int numberOfElements = 0;

        // insert numbers from textField into list (l1)
        for (String s : textInputAdrianSplit) {
            l1.insertFirst(Integer.parseInt(s));
            numberOfElements++;
        }

        /* insert elements in l2 as the problem says and multiply it by f*/
        while(!l1.isEmpty()){
            int last_element = l1.deleteFirst();

            if(!l1.isEmpty()) {
                l2.insertFirst(l1.deleteFirst() * f);
            }

            l2.insertFirst(last_element * f);
        }
        int[] textOuputAdrian = l2.getList(numberOfElements);

        /* show the results */
        outputTextArea.setText("--------------------- Problema 17 ---------------------\n");
        outputTextArea.setText(outputTextArea.getText() + "Inputs elements: " + Arrays.toString(textInputAdrianSplit) + "\n");
        outputTextArea.setText(outputTextArea.getText() + "Outputs elements: " + Arrays.toString(textOuputAdrian));

        outputTextArea.setText(outputTextArea.getText() + "\n--------------------- Problema 17 ---------------------");
    }

    public void setVisibleHarcanInputs(boolean type){
        f_labelText.setVisible(type);
        fInputData.setVisible(type);
    }
}
