package swind;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends JFrame implements MouseListener {
    private JLabel labelMessage;
    private JTextField nomField, ville, passwordField, ageField;
    List aymen =new ArrayList<>();
    private JButton buttonAfficher;
    JLabel label;
    JButton ButOk, btnquit;

    public Main() {
        super("bienvenue");
        setLayout(new FlowLayout());
        labelMessage = new JLabel("if you wont to make a souvgarde make the name of the student");
        nomField = new JTextField(20);
        ageField=new JTextField(20);
       ville = new JTextField(20);
        passwordField = new JTextField(20);
        buttonAfficher = new JButton("afficher");

        label = new JLabel("donner votre choix");
        ButOk = new JButton("souvgarde");
        btnquit = new JButton("show");

        add(labelMessage);
        add(nomField);

        add(passwordField);
        add(buttonAfficher);
        add(label);
        add(ButOk);
        add(btnquit);

        buttonAfficher.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nom = nomField.getText();
                labelMessage.setText("Bonjour " + nom);
            }
        });
        ButOk.addMouseListener(this);
        btnquit.addMouseListener(this);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e,Etudiant etudiant,String nom1) {
        Scanner alex = new Scanner(System.in);
        System.out.println("if you wont souvgrade tapez 1 , if you wont see the studenet press 2");
        String a = alex.nextLine();
        if(a=="1"){
            System.out.println("vous avez tapez 1");

        System.out.println("donner votre nom");
        String nom = alex.nextLine();
        System.out.println("donner votre ville");
        String ville = alex.nextLine();
        System.out.println("donner votre age");
        String age = alex.nextLine();
        System.out.println("on peut ajoute une nv etudiant ");
        if (e.getSource() == ButOk) {
            String mesage = "qulle est  votre prenom";
            aymen.add(new Etudiant(nom, ville, age));
            String reponce = JOptionPane.showInputDialog(this, mesage, "le titre ", JOptionPane.PLAIN_MESSAGE);
            if (reponce != null && reponce.length() != 0) {
                label.setText(reponce);
            }
        } else if (e.getSource() == btnquit) {
            System.exit(0);
        }
        } else if (a=="2") {
 for (int i = 0; i < aymen.size(); i++) {
     if(etudiant.getNom().equals(nom1)){
         System.out.println("nom est " + etudiant.getNom());
         System.out.println("ville est " + etudiant.getVille());
         System.out.println("l'age est " + etudiant.getAge());
     }
 }
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public static void main(String[] args) {
        new Main();
    }
}