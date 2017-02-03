package com.rcc;

public class Vetor {
	
	private Object [] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new Object[capacidade];
		this.tamanho = 0;
	}
	
	public boolean adiciona(Object elementos){
		if(this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elementos;
			this.tamanho ++;
			return true;
		}else{
			return false;
		}
	}
	public boolean adiciona(int posicao, Object elemento){
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		//mover todos os elementos
		for(int i=this.tamanho; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		
		return true;
	}
	public Object buscar(int posicao) throws Exception{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição não encontrada ...");
		}
		return this.elementos[posicao];
	}
	
	public int busca(Object elemento){
		for(int i=0; i<this.tamanho; i++){
			if(this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}
	public int tamanho(){
		return this.tamanho;
	}
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(",");
		}
		if(this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
	

}
