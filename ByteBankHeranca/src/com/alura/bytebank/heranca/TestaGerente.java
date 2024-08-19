package com.alura.bytebank.heranca;

public class TestaGerente {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Luffy D. Monkey");
		g1.setSalario(3000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getSalario());
		System.out.println("Bonificação: " + g1.getBonificacao());
		System.out.println("O salario final é: " + g1.getSalarioFinal());
		
//		g1.setSenha(3007);
//		boolean autenticou = g1.autentica(3007);
//		System.out.println(autenticou);
	}
}