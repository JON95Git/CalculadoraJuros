package br.unisal.calculadorajuros.util;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonathan
 */
public class Mensagem {

    private Mensagem() {}

    public static void erro(String texto) {
        JOptionPane.showMessageDialog(null, texto);
    }

}
