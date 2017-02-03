package com.rcc;

public class Teste {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		Contato c1 = new Contato("Rafeal", "44990-08032", "rafal@hotmail.com");
		Contato c2 = new Contato("Rose", "20-08032", "rafalas@hotmail.com");
		Contato c3 = new Contato("Vitor", "3-08032", "rafas@hotmail.com");
		Contato c4 = new Contato("Heitor", "50-08032", "raf@hotmail.com");
		
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		vetor.adiciona(c4);
		
		System.out.println("Tamanho = "+vetor.tamanho());
		
		int pos = vetor.busca(c1);
		if(pos > -1){
			System.out.println("Elemento existe");
		}else{
			System.out.println("Elemento não existe");
		}
		
		System.out.println(vetor);
		

	}

}
