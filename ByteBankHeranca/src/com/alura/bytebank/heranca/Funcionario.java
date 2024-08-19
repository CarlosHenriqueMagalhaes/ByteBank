package com.alura.bytebank.heranca;

//adicionado o abstract defino que essa classe é abstrata, ou seja, nó pode existir um
//funcionário sem papel na empresa, ele tem que ter uma função um papel
//nao pode instanciar apartir dessa classe
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// método abstract - sem corpo, as implementações
	// se tornam obrigatórias nas classes filhas
	public abstract double getBonificacao();

	public double getSalarioFinal() {
		return this.getSalario() + this.getBonificacao();
	}

	public String getNome() {
		System.out.print("Nome do funcionário: ");
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		System.out.print("CPF: ");
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
