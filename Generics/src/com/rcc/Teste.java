package com.rcc;

public class Teste {

	public static void main(String[] args) {

		Lista<Contato> vetor = new Lista<Contato>(1);

		Contato c1 = new Contato("Rafeal", "44990-08032", "rafal@hotmail.com");
		Contato c2 = new Contato("Rose", "20-08032", "rafalas@hotmail.com");
		Contato c3 = new Contato("Vitor", "3-08032", "rafas@hotmail.com");
		Contato c4 = new Contato("Heitor", "50-08032", "raf@hotmail.com");

		vetor.adiciona(c1);

	}

}
