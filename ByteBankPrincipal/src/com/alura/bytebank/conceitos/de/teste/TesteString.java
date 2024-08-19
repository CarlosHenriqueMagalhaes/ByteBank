package com.alura.bytebank.conceitos.de.teste;

/**
 * Classe testa funcionalidades da classe String
 * 
 * @author carlos.magalhaes
 *
 */
public class TesteString {

	public static void main(String[] args) {

		String nome = "Scarlate"; // objeto literal
		// String outro = new String ("Violeta");//mesma coisa do código acima
		// Porém em Java com STRING não precisamos iniciar assim!

		String vazio = "";

		String maisUmNome = "   Violeta   ";

		String outro = nome.replace("S", "s");// funciona porque aqui é outro
		// String não o "nome" .O valor instanciado em String é imutavel

		System.out.println(nome);
		System.out.println(outro);

		// Veja que aqui ja é outro atributo do tipo String criado.
		// O retorno SCARLATE é do "outroUpper e não de nome!
		String outroUpper = nome.toUpperCase();
		System.out.println(outroUpper);

		// Veja que aqui ja é outro atributo do tipo String criado.
		// O retorno scarlate é do "outrolower e não de nome!
		String outrolower = nome.toLowerCase();
		System.out.println(outrolower);

		// Exibe qual char esta na posição 2 do nome, lembrando que a
		// contagem começa no zero.
		char posicaoDois = nome.charAt(2);
		System.out.println(posicaoDois);

		// Indica apartir de qual char sera exibido na String
		String sub = nome.substring(4);
		System.out.println(sub);

		// Para saber quantos caracteres tem minha String
		System.out.println(nome.length()); // retorna 8

		// imprimir caractere por caractere
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}

		// Verificar se uma String esta vazia
		System.out.println(vazio.isEmpty());
		System.out.println(nome.isEmpty());

		// Verificar se uma String contem um determinado caracter
		// ou uma sequencia de caracteres
		System.out.println(vazio.contains("s"));
		System.out.println(nome.contains("l"));
		System.out.println(nome.contains("Scar"));

		// Remove espaços
		System.out.println(maisUmNome);
		System.out.println(maisUmNome.trim());

	}

}
