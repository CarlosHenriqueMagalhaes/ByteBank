package com.alura.bytebank.conceitos.de.teste;

public class TesteArraysPrimitivos {

	public static void main(String[] args) {

		String[] version = new String[9];// inicializa o array com 0

		version[0] = "Red";
		version[1] = "Crystal";
		version[2] = "Ruby";
		version[3] = "Platinum";
		version[4] = "Black 2";
		version[5] = "Y";
		version[6] = "UltraSun";
		version[7] = "Sword";
		version[8] = "Scarlet";

		String versionSete = version[6];

		System.out.println(versionSete);
		System.out.println(version.length);

		for (int i = 0; i < version.length; i++) {
			System.out.print(version[i]+" - ");
		}
	}

}
