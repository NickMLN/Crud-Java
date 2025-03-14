package br.senac.sp.livraria.view;

import br.senac.sp.livraria.enumeration.Escolaridade;
import br.senac.sp.livraria.enumeration.EstadoCivil;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class ViewCliente extends JFrame {
    JLabel lbIb, lbCpf, lbNome, lbNasimento, lbTelefone, lbEmail;
    JTextField tfId, tfCpf, tfNome, tfNascimento, tfTelefone, tfEmail;
    Font fontPadrao;
    MaskFormatter mskNascimento;
    JTextArea tEndereco;
    JComboBox<Escolaridade> cbEscolaridade;
    JComboBox<EstadoCivil> cbEstadoCivil;

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
        lbIb.setBounds(10, 20, 20, 20);
        lbIb.setFont(fontPadrao);

        //tfId
        tfId = new JTextField();
        tfId.setBounds(30, 20, 20, 20);
        tfId.setEnabled(false);
        tfId.setFont(fontPadrao);
        tfId.setHorizontalAlignment(SwingConstants.CENTER);

        //lbCpf
        lbCpf = new JLabel("Cpf: ");
        lbCpf.setBounds(70, 20, 50, 20);
        lbCpf.setFont(fontPadrao);

        //tfCpf
        tfCpf = new JTextField();
        tfCpf.setBounds(100, 20, 100, 20);
        tfCpf.setEnabled(false);
        tfCpf.setFont(fontPadrao);
        tfCpf.setHorizontalAlignment(SwingConstants.CENTER);

        //lbNome
        lbNome = new JLabel("Nome: ");
        lbNome.setBounds(220, 20, 50, 20);
        lbNome.setFont(fontPadrao);

        //tfNome
        tfNome = new JTextField();
        tfNome.setBounds(270, 20, 150, 20);
        tfNome.setEnabled(false);
        tfNome.setFont(fontPadrao);
        tfNome.setHorizontalAlignment(SwingConstants.CENTER);

        //lbNascimneto
        lbNasimento = new JLabel("Nascimento: ");
        lbNasimento.setBounds(440, 20, 100, 20);
        lbNasimento.setFont(fontPadrao);

        //mskNascimento
        try {
            mskNascimento = new MaskFormatter("##/##/##");
            mskNascimento.setPlaceholderCharacter('_');
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

        //tfNascimento
        tfNascimento = new JFormattedTextField(mskNascimento);
        tfNascimento.setBounds(520, 20, 70, 20);
        tfNascimento.setEnabled(false);
        tfNascimento.setFont(fontPadrao);
        tfNascimento.setHorizontalAlignment(SwingConstants.CENTER);
////
////        //lbTelefone
////        lbTelefone = new JLabel("Telefone: ");
////        lbTelefone.setBounds(90, 40, 100, 20);
////        lbTelefone.setFont(fontPadrao);
////
////        //tfTelefone
////        tfTelefone = new JTextField();
////        tfTelefone.setBounds(200, 40, 70, 20);
////        tfTelefone.setEnabled(false);
////        tfTelefone.setFont(fontPadrao);
////        tfTelefone.setHorizontalAlignment(SwingConstants.CENTER);
////
////        //lbEmail
////        lbEmail = new JLabel("Telefone: ");
////        lbEmail.setBounds(90, 40, 100, 20);
////        lbEmail.setFont(fontPadrao);
//
//        //tfEmail
//        tfEmail = new JTextField();
//        tfEmail.setBounds(200, 40, 70, 20);
//        tfEmail.setEnabled(false);
//        tfEmail.setFont(fontPadrao);
//        tfEmail.setHorizontalAlignment(SwingConstants.CENTER);

        //Adiconar Componentes
        Container base = getContentPane();
        base.setLayout(null);
        base.add(lbIb);
        base.add(tfId);
        base.add(lbCpf);
        base.add(tfCpf);
        base.add(lbNome);
        base.add(tfNome);
        base.add(lbNasimento);
        base.add(tfNascimento);

        //Parâmetros do frame
        setSize(1000, 1000);
        setLocationRelativeTo(null);
        setBackground(Color.BLACK);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //Definir Componentes
    private void actions() {

    }
}