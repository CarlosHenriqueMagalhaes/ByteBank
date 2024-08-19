package com.alura.bytebank.heranca;

//Classe para Funcionários que podem, tem permissão para acessas o SI
//Precisam de autenticação, foi definido que apenas Gerentes e Administradores
//podem acessar o Sistema Interno
public class SistemaInterno {
	
	//Apenas quem for autenticado e usar essa senha pode acessar
	private int senha = 2222; 
	
	public void autentica(Autenticacao funcionarioAutentica) {
		boolean autenticou = funcionarioAutentica.autentica(this.senha);
		if(autenticou) {
			System.out.println("Pode entrar no sistema!");
		}else {
			System.out.println("Não Pode entrar no sistema!");
		}
		
	}

}
