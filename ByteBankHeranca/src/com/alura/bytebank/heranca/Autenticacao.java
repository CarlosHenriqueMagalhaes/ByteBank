package com.alura.bytebank.heranca;

//Contrato Autenticavel:
//Quem assina esse contrato precisa implementar
//senha e autentica
//Necessário para entrar no Sistema Interno
public abstract interface Autenticacao {

	public abstract boolean autentica(int senha);

	public abstract void setSenha(int senha);

}
