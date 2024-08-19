package com.alura.bytebank.heranca;

//Aplicando Polimorfismo
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario funcionario) {
		double boni = funcionario.getBonificacao();
		this.soma = boni + this.soma;
	}

	public double getSoma() {
		return soma;
	}

}
