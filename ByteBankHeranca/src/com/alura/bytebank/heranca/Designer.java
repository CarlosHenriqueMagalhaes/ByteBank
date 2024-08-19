package com.alura.bytebank.heranca;

public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação DESIGNER");
		return 200;
	}
}
