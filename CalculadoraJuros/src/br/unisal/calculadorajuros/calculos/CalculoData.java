package br.unisal.calculadorajuros.calculos;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonathan
 */
public class CalculoData {

    public CalculoData() {
    }

    public static int diferencaDatas(Date dt1, Date dt2) {
        long tempo1 = dt1.getTime();
        long tempo2 = dt2.getTime();
        long difTempo = tempo2 - tempo1;
        return (int) ((difTempo + 60L * 60 * 1000) / (24L * 60 * 60 * 1000)) + 1;
    }

}
