package br.unisal.calculadorajuros.exception;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathan
 */
public class ValorInvalidoException extends NumberFormatException {

    public ValorInvalidoException() {
        super("Preencha valores válidos!");
    }

}
