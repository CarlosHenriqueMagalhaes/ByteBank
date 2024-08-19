package com.alura.bytebank.modelo;

/**
 * Classe representa a moldura de uma Conta Poupança
 * 
 * @author carlos.magalhaes
 *
 */

public class ContaPoupanca extends Conta {

	// Definimos o construtor da classe mãe aqui!
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString(); // chama o método da classe mãe

	}
}
