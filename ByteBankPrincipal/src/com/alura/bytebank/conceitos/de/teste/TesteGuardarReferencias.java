package com.alura.bytebank.conceitos.de.teste;

import java.util.ArrayList;

import com.alura.bytebank.modelo.Conta;
import com.alura.bytebank.modelo.ContaCorrente;


//Guardar referencias com ArrayList
public class TesteGuardarReferencias {

	public static void main(String[] args) {
// Sem o uso do Array list teriamos que fazer o método abaixo e a criação de uma classe
// para adicionar, checar tamanho, guardar e remover referencias, etc...
//		GuardarReferencias guardar = new GuardarReferencias();
//		
//		Conta cc1 = new ContaCorrente(22, 11);
//		guardar.adiciona(cc1);
//		
//		Conta cc2 = new ContaCorrente(22, 12);
//		guardar.adiciona(cc2);
//		
//		int tamanho = guardar.getQuantidadeDeElementos();
//		System.out.println(tamanho);
//		
//		Conta ref = (Conta) guardar.getReferencia(1);
//		System.out.println(ref.getNumero());
//		
		System.out.println("-------------------------");
//		ArrayList lista = new ArrayList(); // Ao chamarmos esse método exibe o total de contas (vem carregado ao criar uma nova conta
		ArrayList <Conta> lista = new ArrayList<Conta>(); // <> Indica o tipo que a Arraylist guarda restringimos aqui apenas para contas
		//Isso é chamado de Generics: ArrayList <Conta>


		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		Conta cc3 = new ContaCorrente(33, 500);
		lista.add(cc3);
		Conta cc4 = new ContaCorrente(33, 501);
		lista.add(cc4);

		System.out.println(lista.size());
		System.out.println("------Numero da Conta guardada na posição 0 (referencia)------------");
		Conta ref = (Conta) lista.get(0); // cast
		System.out.println(ref.getNumero());
		
		System.out.println("-----Após remover a conta da posição 0, total de contas é:----------");
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		System.out.println("-----Contas salvas na ArrayList:----------");
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		System.out.println("-----(modalidade simplificada do for) Contas salvas na ArrayList:----------");
//Mesmo for acima:		
//		for (Object o : lista) {
//			System.out.println(o);
		//fica assim após adicionarmos o generic ArrayList<Conta>
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
