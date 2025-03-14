package br.senac.sp.view;

import javax.swing.*;
import java.awt.*;

public class ViewCliente extends JFrame {
    JLabel lbIb;
    JTextField tfId;
    Font fontPadrao;

    public static void main(String[] args) {
        new ViewCliente();
    }

    public ViewCliente() {
        initComponents();
        actions();
    }

    // Construir a Tela
    private void initComponents() {
        fontPadrao = new Font("Tahoma", Font.PLAIN, 12);
        //lbId
        lbIb = new JLabel("ID: ");
        lbIb.setBounds(20,20,50,20);
        lbIb.setFont(fontPadrao);

        //Adiconar Componentes
        getContentPane().add(lbIb);

        //Parâmetros do frame
        setSize(500, 500);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setUndecorated(true);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Definir Componentes
    private void actions() {

    }
}