package com.alura.bytebank.conceitos.de.teste;

import com.alura.bytebank.modelo.Conta;
import com.alura.bytebank.modelo.ContaCorrente;
import com.alura.bytebank.modelo.ContaPoupanca;

public class TesteArraysReferencias {

	public static void main(String[] args) {
		
		//ContaCorrente [] contas = new ContaCorrente [5]; //inicializa com null
		Conta[] contas = new Conta [5];//Ao utilizar Conta ao invez do cod acima, consigo guardar tando CC quanto CP
		//se eu alterar a Conta para Object, eu consigo guardar qualquer objeto nessa array
		//Exemplo:
//		Object[] contas = new Object [5];
//		Cliente cliente = new Cliente();
//		contas [2] = cliente;
		
		ContaCorrente cc1 = new ContaCorrente(3471, 03);
		ContaCorrente cc2 = new ContaCorrente(3471, 40);
		ContaCorrente cc3 = new ContaCorrente(3471,66);
		
		ContaPoupanca cp1 = new ContaPoupanca(9997, 05);
		
		contas [0] = cc1;
		contas [3] = cc2;
		contas [4] = cc3;
		
		contas [1] = cp1;
		
		System.out.println("-----Traz as contas em suas devidas gavetas--------");
		System.out.println(contas[1]);
		System.out.println(contas[0]);
		System.out.println("-----Traz dados da conta guardada usando get--------");
		System.out.println(contas[0].getNumero());//pega o numero da conta 0
		System.out.println(contas[0].getAgencia());
		System.out.println("-----Padrão de uma gaveta sem conta guardada--------");
		System.out.println(contas[2]); //null que é o padrão
		//System.out.println(contas[1].getNumero());// lança exception
		
		System.out.println("-----Numero da conta e Numero da conta por referencia--------");
		//ContaCorrente ref = contas[0]; //não funciona mais (a não ser que uso um type cast, veja abaixo
		Conta ref = contas[0];
		ContaPoupanca refTeste2 = (ContaPoupanca)contas [1];//type Cast //nesse caso apontei para a CP se eu apontar para a CC ele da erro e exibe exception
		System.out.println(cc1.getNumero());
		System.out.println(ref.getNumero());
		System.out.println(refTeste2.getNumero());
		}
		

	}


