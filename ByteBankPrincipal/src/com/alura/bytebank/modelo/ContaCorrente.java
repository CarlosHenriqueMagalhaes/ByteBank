package com.alura.bytebank.modelo;

/**
 * Classe representa a moldura de uma Conta Corrente
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.excecao.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel {

	// Definimos o construtor da classe mãe aqui!
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}

	// sobrescrever método ( digitei saca + CTRL + ESPAÇO, assim gerou o código
	// abaixo)
	// uso esse método para reaproveitar um código sobrescrevendo ele na classe que
	// a mudança de regras seja necessária
//	@Override
//	public boolean saca(double valor) {
//		// TODO Auto-generated method stub
//		return super.saca(valor);
//	}

	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString(); // chama o método da classe mãe
		// return "ContaCorrente, Numero: " + super.getNumero();
	}
}
