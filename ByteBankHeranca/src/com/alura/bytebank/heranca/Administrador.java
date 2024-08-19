package com.alura.bytebank.heranca;

//Administrador é um Funcionario e "assina" contrato de Autenticacao
public class Administrador extends Funcionario implements Autenticacao {

	private AutenticacaoUtil autenticador;

	@Override
	public double getBonificacao() {
		return 50;
	}

	public Administrador() {
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
