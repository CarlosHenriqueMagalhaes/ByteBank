package com.alura.bytebank.heranca;

//Gerente é um Funcionario e "assina" contrato de Autenticacao
public class Gerente extends Funcionario implements Autenticacao {

	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação GERENTE");
		return super.getSalario();
	}

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
}