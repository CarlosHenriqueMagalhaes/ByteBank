package com.alura.bytebank.modelo;

/**
 * Classe representa a moldura de uma Conta
 * @author carlos.magalhaes
 *
 */

import com.alura.bytebank.excecao.SaldoInsuficienteException;

public abstract class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalDeContas; // é um atributo global!

	// Métodos

	/**
	 * Método que insere um valor no saldo de uma Conta
	 * 
	 * @param valor
	 */
	public void deposita(double valor) {
		this.saldo += valor;
	}

	/**
	 * Método que saca/retira um valor no saldo de uma conta
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	// Método com tratamento Exception unchecked
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(
					"Não foi possivel sacar!" + "Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	/**
	 * Método toString para as classes ContaCorrente e ContaPoupanca
	 */
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia;
	}

	// Construtores

	public Conta(int agencia, int numero) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		Conta.totalDeContas++;
		System.out.println("O total de contas é " + totalDeContas);
		// A cada conta criada ele soma + 1,exibindo o total de
		// contas existentes! Isso é possivel pois "totalDeContas" ele é static
	}

	// Acessores

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode ser menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

}
