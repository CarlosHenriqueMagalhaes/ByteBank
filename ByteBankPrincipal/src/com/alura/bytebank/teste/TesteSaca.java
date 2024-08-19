package com.alura.bytebank.teste;

/**
 * Essa classe testa o método saca presente na ContaCorrente
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.excecao.SaldoInsuficienteException;
import com.alura.bytebank.modelo.Conta;
import com.alura.bytebank.modelo.ContaCorrente;

//funciona a "bomba" sem o try catch, mas usamos para fazer o 
//tratamento de exception
public class TesteSaca {

	public static void main(String[] args) {

		Conta conta = new ContaCorrente(0556, 10);

		conta.deposita(200);

		try {
			conta.saca(210);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Ex: " + ex.getMessage());
		}

		System.out.println("Saldo: " + conta.getSaldo());

	}

}
