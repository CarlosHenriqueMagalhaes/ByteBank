package com.alura.bytebank.teste;

/**
 * Essa classe Testa os "tributaveis"
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.modelo.CalculadorDeImposto;
import com.alura.bytebank.modelo.ContaCorrente;
import com.alura.bytebank.modelo.SeguroDeVida;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(73273, 005);
		cc.deposita(100.0);

		SeguroDeVida seguro = new SeguroDeVida();

		CalculadorDeImposto calc = new CalculadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);

		System.out.println(calc.getTotalImposto());
	}

}
