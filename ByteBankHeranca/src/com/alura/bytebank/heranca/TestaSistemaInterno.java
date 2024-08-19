package com.alura.bytebank.heranca;

public class TestaSistemaInterno {
	
	public static void main(String[] args) {
		
		//A senha definida em SistemaInterno é 2222
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);
		
		Administrador adm = new Administrador();
		adm.setSenha(3333);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(2222);
		
		SistemaInterno sI =new SistemaInterno();
		sI.autentica(gerente);
		sI.autentica(adm);
		sI.autentica(cliente);
	}

}
