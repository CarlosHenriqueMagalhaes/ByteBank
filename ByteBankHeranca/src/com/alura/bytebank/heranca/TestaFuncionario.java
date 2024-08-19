package com.alura.bytebank.heranca;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new Gerente();
		nico.setNome("Nico Robin");
		nico.setCpf("890.789.987-99");
		nico.setSalario(2500);

		System.out.println(nico.getNome());
		System.out.println("Bonificação: " + nico.getBonificacao());
	}

}
