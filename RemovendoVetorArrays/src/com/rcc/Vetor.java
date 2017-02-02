package com.rcc;

public class Vetor {
	
	private String [] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	/*
	public void adiciona(String elementos){
		for(int i=0; i<this.elementos.length;i++){
			if(this.elementos[i] == null){
				this.elementos[i] = elementos;
				break;
			}
		}
	}
	*/
	
	public boolean adiciona(String elementos){
		this.aumentaCapacidade();		
		if(this.tamanho < this.elementos.length){
		
			this.elementos[this.tamanho] = elementos;
			this.tamanho ++;
			return true;
		}else{
			return false;
		}
	}
	private void aumentaCapacidade(){
		if(this.tamanho == this.elementos.length){
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public boolean adiciona(int posicao, String elemento){
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for(int i=this.tamanho; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		
		return true;
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
	
	public void remover(int posicao){
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição Invalida");
		}
		for(int i=posicao; i<this.tamanho-1; i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho --;
		
		
	}
	

}
