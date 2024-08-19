package com.alura.bytebank.modelo;

/**
 * Classe representa a moldura de um Seguro de Vida apenas para teste
 * 
 * @author carlos.magalhaes
 *
 */

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
