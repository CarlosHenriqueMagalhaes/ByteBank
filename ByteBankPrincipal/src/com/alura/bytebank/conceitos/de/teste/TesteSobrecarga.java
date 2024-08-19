package com.alura.bytebank.conceitos.de.teste;

/**
 * Classe testa funcionalidades de sobrecarga
 * 
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.modelo.ContaCorrente;
import com.alura.bytebank.modelo.ContaPoupanca;

//sobrecarga (mesmo método, mas com parametros diferentes)
public class TesteSobrecarga {

	public static void main(String[] args) {

		System.out.println("x");
		System.out.println(3);
		System.out.println(false);

		// Polymorfismo, referenciar de maneira genérica:
//		ContaCorrente cc = new ContaCorrente(10,100);
//		ContaPoupanca cp = new ContaPoupanca(11,20);
//		Conta cc = new ContaCorrente(10,100);
//		Conta cp = new ContaPoupanca(11,20);
		Object cc = new ContaCorrente(10, 100);
		Object cp = new ContaPoupanca(11, 20);

		// Como implementei o toString na minha ContaCorrente
		// e chamei ela aqui, ela não retorna mais o endereco da classe
		// e sim o String setado
		System.out.println(cc.toString());// ContaCorrente, Numero:
		System.out.println(cp);// com.alura.bytebank.modelo.ContaPoupanca@7c30a502

		println();
	}

	static void println() {
	}

	static void println(int a) {
	}

	static void println(boolean valor) {
	}

	// Todas as classes extends de Object
	// static void println(ContaCorrente referencia){ //polymorfismo
	// static void println(Conta referencia){ //polymorfismo
	static void println(Object referencia) { // polymorfismo

	}

}
