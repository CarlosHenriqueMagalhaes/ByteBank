package com.alura.bytebank.teste;

/**
 * Testa métodos das contas (transfere)
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.excecao.SaldoInsuficienteException;
import com.alura.bytebank.modelo.ContaCorrente;
import com.alura.bytebank.modelo.ContaPoupanca;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(03135, 01);
		cc.deposita(100);

		ContaPoupanca cp = new ContaPoupanca(347103, 01);
		cp.deposita(200);

		cc.transfere(10, cp);

		System.out.println("CC - Saldo: " + cc.getSaldo());
		System.out.println("CP - Saldo: " + cp.getSaldo());

	}

}
