package br.unisal.calculadorajuros.calculos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class CalculoJuros {

    public CalculoJuros() {
    }

    public static String calculaFormataValorTotal(double valor, double juros, double multa, int atraso) {

        String total = String.format("%.2f", (valor + multa + (atraso * juros)));

        return total;
    }

    public static String calculcaMultaJuros(double juros, double multa, double atraso) {

        String multaJuros = String.format("%.2f", ((juros * atraso) + multa));

        return multaJuros;
    }

    public static String calculoJurosFinal(double juros, double atraso) {

        String jurosFinal = String.format("%.2f", juros * atraso);
        return jurosFinal;
    }

}
