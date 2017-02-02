package com.rcc;

public class TestePrincipal {

	public static void main(String[]args){
		
		Vetor vetor = new Vetor(10);
		
		try {
			vetor.adiciona("Rafael");
			vetor.adiciona("Rose");
			vetor.adiciona("Vitor");
			vetor.adiciona("Heitor");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(vetor.toString());
		
	}
}
