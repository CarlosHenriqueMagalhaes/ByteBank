package com.alura.bytebank.excecao;

/**
 * Classe para tratamento de Exception de saldo insuficiente
 * 
 * @author carlos.magalhaes
 *
 */

//Conceitos:
//Lembre-se da pilha!
//Tratamento com try catch ou throws
//checked   - avisa quando tem exceção -- extends Exception
//unchecked - não avisa -- extends RuntimeException

public class SaldoInsuficienteException extends Exception {
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
