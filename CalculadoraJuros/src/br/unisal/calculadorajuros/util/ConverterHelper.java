/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unisal.calculadorajuros.util;
import br.unisal.calculadorajuros.exception.CampoInvalidoException;

/**
 *
 * @author jonathan
 */
public class ConverterHelper {

    public ConverterHelper() {
    }
    
    public static double parseDouble(String texto) {

        double valor = 0.0;
        try {
            valor = Double.parseDouble(texto.replace(',', '.'));
        } catch (NumberFormatException ex) {
            throw new CampoInvalidoException();
        }

        return valor;
    }
    
}
