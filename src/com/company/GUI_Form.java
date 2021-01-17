package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
    private JLabel mLabel;
    private JLabel nLabel;
    private JButton continueButton;
    private JLabel totalLabel;
    private JTextField fInputData;
    private JLabel f_labelText;

    int m, n, prod;

    public GUI_Form() {

        add(rootPanel);

        setTitle("Proiect ISW");
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
                problemName.setText("12. Să se calculeze înălțimea unei stive și să se determine dacă  valoarea sa se regăsește ca element în stivă");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultAndreiDumitru();
                    }
                });
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
                setVisibleHarcanInputs(true);
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
                problemName.setText("7. Eliminarea dintr-o listă  simplă  înlănțuită a cheilor  pozitive , cu sau fără eliberare de memorie.");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultCarstoceaCosmin();
                    }
                });
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
                problemName.setText("29. Să se afișeze și să se numere elementele aflate în intervalul [a,b] dintr-un arbore binar");
                openProblemPanel();

                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultMiloiuMarian();
                    }
                });
            }
        });

        baciuAlexandruButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                studentName.setText("Baciu Alexandru");
                problemName.setText("8. Să se determine lungimea și maximul unei stive");
                openProblemPanel();
                submitButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        showResultAlexandruBaciu();
                    }
                });
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
        ArboreElisei arboreElisei = new ArboreElisei();


        // get text from textBox, and insert in the tree
        String textInput = inputTextArea.getText();

        // verify if it contains incorrect characters
        if (textInput.matches(".*[a-z].*") || textInput.contains(",") || textInput.matches(".*[A-Z].*") || textInput.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // separate numbers, and insert in the tree
        String[] textInputSplit = textInput.split(" ");
        for (String s : textInputSplit) {
            try {
                arboreElisei.insert(Integer.parseInt(s));
            }catch (Exception e){
                JOptionPane.showMessageDialog(rootPanel,
                        "Input-ul contine caractere interzise sau double-space.",
                        "Error input",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        //get height tree
        int inaltimeArbore = arboreElisei.inaltimeArbore(arboreElisei.root);

        // update contor nods
        arboreElisei.updateRSD(arboreElisei.root);

        // Show in textBox outputs
        outputTextArea.setText("--------------------- Problema 50 ---------------------\n");
        outputTextArea.setText(outputTextArea.getText() + "\n Inaltime arbore: " + inaltimeArbore);
        outputTextArea.setText(outputTextArea.getText() + "\n Arbore inainte: " + arboreElisei.noduriArbore);
        arboreElisei.noduriArbore = "";
        arboreElisei.inserareVLRN(arboreElisei.root, inaltimeArbore);
        outputTextArea.setText(outputTextArea.getText() + "\n Raspuns: " + arboreElisei.updateRSD(arboreElisei.root));
        outputTextArea.setText(outputTextArea.getText() + "\n\n--------------------- Problema 50 ---------------------");
        arboreElisei.noduriArbore = "";
        arboreElisei.contorInaltime = 0;
    }

    public void showResultAlinAldescu() {
//        create a new LinkList
        LinkListAlin theList = new LinkListAlin();

//        get input
        String textInputAlin = inputTextArea.getText();

        if (textInputAlin.matches(".*[a-z].*") || textInputAlin.contains(",") || textInputAlin.matches(".*[A-Z].*") || textInputAlin.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAlinSplit = textInputAlin.split(" ");

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

    public void showResultCarstoceaCosmin() {
        // creare lista noua
        LinkListCosmin theList = new LinkListCosmin();

        String textInputCosmin = inputTextArea.getText();

        if (textInputCosmin.matches(".*[a-z].*") || textInputCosmin.contains(",") || textInputCosmin.matches(".*[A-Z].*") || textInputCosmin.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputCosminSplit = textInputCosmin.split(" ");

//        insert input items in the List
        for (String s : textInputCosminSplit) {
            theList.insertFirst(Integer.parseInt(s));
        }

        theList.displayList();
        theList.deletePositive();
        theList.displayList();

        ArrayList<Integer> newArr = theList.getResultArray();

        outputTextArea.setText("--------------------- Problema 7 ---------------------\n");
        for (Integer item : newArr) {
            outputTextArea.setText(outputTextArea.getText() + item + " ");
        }
        outputTextArea.setText(outputTextArea.getText() + "\n--------------------- Problema 7 ---------------------");
    }

    public void showResultAndreiDumitru() {
        StackAndrei theStack = new StackAndrei(20);

        String textInputAndrei = inputTextArea.getText();

        if (textInputAndrei.matches(".*[a-z].*") || textInputAndrei.contains(",") || textInputAndrei.matches(".*[A-Z].*") || textInputAndrei.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAndreiSplit = textInputAndrei.split(" ");

//        insert input items in the List
        for (String s : textInputAndreiSplit) {
            theStack.push(Integer.parseInt(s));
        }

        int stackHeight = 0;
        // aici vom stoca cheile negative din lista
        ArrayList<Integer> stackArray = new ArrayList<>(1);

        while (!theStack.isEmpty()) {
            int value = theStack.pop();
            stackArray.add(value);
            stackHeight++;
        }

        int ok = 0;
        for (Integer item : stackArray) {
            if (item == stackHeight) {
                ok = 1;
                break;
            }
        }

        outputTextArea.setText("--------------------- Problema 12 ---------------------\n");
        outputTextArea.setText(outputTextArea.getText() + "Înălțimea stivei este: ");
        outputTextArea.setText(outputTextArea.getText() + stackHeight + "\n");
        if (ok == 1) {
            outputTextArea.setText(outputTextArea.getText() + "Valoarea sa se regăsește în stivă.");
        } else {
            outputTextArea.setText(outputTextArea.getText() + "Valoarea sa nu se regăsește în stivă.");
        }
        outputTextArea.setText(outputTextArea.getText() + "\n--------------------- Problema 12 ---------------------");
    }

    public void showResultAlexandruBaciu() {
        StackAlexandru theStack = new StackAlexandru(20);

        String textInputAlexandru = inputTextArea.getText();

        if (textInputAlexandru.matches(".*[a-z].*") || textInputAlexandru.contains(" ") || textInputAlexandru.matches(".*[A-Z].*") || textInputAlexandru.length() == 0) {
            
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAlexandruSplit = textInputAlexandru.split(",");

//        insert input items in the List
        for (String s : textInputAlexandruSplit) {
            theStack.push(Integer.parseInt(s));
        }

        int stackLength = 0;
        // aici vom stoca cheile negative din lista
        ArrayList<Integer> stackArray = new ArrayList<>(1);

        while (!theStack.isEmpty()) {
            int value = theStack.pop();
            stackArray.add(value);
            stackLength++;
        }

        int max = stackArray.get(0);
        for (Integer item : stackArray) {
            if (item > max)
                max = item;
        }

        outputTextArea.setText("--------------------- Problema 8 ---------------------\n");
        outputTextArea.setText(outputTextArea.getText() + "Lungimea stivei este: ");
        outputTextArea.setText(outputTextArea.getText() + stackLength + "\n");
        outputTextArea.setText(outputTextArea.getText() + "Elementul maxim din stivă este: ");
        outputTextArea.setText(outputTextArea.getText() + max);
        outputTextArea.setText(outputTextArea.getText() + "\n--------------------- Problema 8 ---------------------");
    }

        public void showResultHarcanAdrian() {
        LinkListAdrian l1= new LinkListAdrian();
        LinkListAdrian l2= new LinkListAdrian();
        int f;

        /* Get inputs from TextFields */
        try{
            f = Integer.parseInt(fInputData.getText());
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPanel,
                    "Campul 'f' nu a fost completat sau a fost completat gresit. Acest camp trebuie sa contina un singur numar. ",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String textInputAdrian = inputTextArea.getText();

        if (textInputAdrian.matches(".*[a-z].*") || textInputAdrian.contains(",") || textInputAdrian.matches(".*[A-Z].*") || textInputAdrian.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        String[] textInputAdrianSplit = textInputAdrian.split(" ");
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

    public void showResultMiloiuMarian() {
        ArboreBinarMarian arbore = new ArboreBinarMarian();


        // get text from textBox, and insert in the tree
        String textInputMarian = inputTextArea.getText();

        // verify if it contains incorrect characters
        if (textInputMarian.matches(".*[a-z].*") || textInputMarian.contains(",") || textInputMarian.matches(".*[A-Z].*") || textInputMarian.length() == 0) {
            JOptionPane.showMessageDialog(rootPanel,
                    "Input-ul trebuie sa contina doar cifre, separate prin virgula.",
                    "Error input",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        // separate numbers, and insert in the tree

        String[] textInputMarianSplit = textInputMarian.split(" ");
        for (String s : textInputMarianSplit) {
            arbore.insertValue(Integer.parseInt(s));
        }


        Scanner myObj = new Scanner(System.in);
        String k1;
        String k2;



        outputTextArea.setText(outputTextArea.getText() + "\n Enter interval ");

        //  arbore.Print(arbore.root, );
        //   arbore.getCount(arbore.root,20, 50);



        outputTextArea.setText(outputTextArea.getText() + arbore.printArbore(arbore.root,10,29));





        //get height tree

        // update contor nods


    }
}
