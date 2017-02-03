package com.rrc;

import java.util.ArrayList;

public class Array {
	
	public static void main(String[]args){
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//busca
		boolean existe = arrayList.contains("A");
		if(existe){
			System.out.println("Elemento existe");
		}else{
			System.out.println("Não existe");
		}
		
		//indice.
		int pos = arrayList.indexOf("B");
		if(pos > -1){
			System.out.println("Elemento existe");
		}else{
			System.out.println("Não existe");
		}
		
		//busca por posição
		System.out.println(arrayList.get(2));
		
		//removendo
		arrayList.remove(2);
		arrayList.remove("A");
		
		System.out.println(arrayList);
		
		//tamanho
		System.out.println(arrayList.size());
		
		
		
	}
}
