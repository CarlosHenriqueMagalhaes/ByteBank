package com.alura.bytebank.heranca;

public class TestaControleBonificacao {

	public static void main(String[] args) {

		Funcionario g2 = new Gerente();
		g2.setNome("Zoro Roronoa");
		g2.setSalario(5000);

		Funcionario ev1 = new EditorDeVideo();
		ev1.setNome("Ussop");
		ev1.setSalario(2500);

		Funcionario dg1 = new Designer();
		dg1.setNome("Frankling");
		dg1.setSalario(1800);

		// Esse método faz a soma de todas as bonificações de todos os funcionarios
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g2);
		controle.registra(ev1);
		controle.registra(dg1);

		System.out.println("A soma da Bonificação de todos funcionários é: " + controle.getSoma());

	}

}
