package com.rcc;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elementos){ for(int i=0;
	 * i<this.elementos.length;i++){ if(this.elementos[i] == null){
	 * this.elementos[i] = elementos; break; } } }
	 */
	public void adiciona(String elementos) throws Exception {

		if (this.tamanho < this.elementos.length) {

			this.elementos[this.tamanho] = elementos;
			this.tamanho++;
		} else {
			throw new Exception("vetor já cheio");
		}
	}
	public String buscar(int posicao) throws Exception{
		if(!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição não encontrada ...");
		}
		return this.elementos[posicao];
	}

	public int tamanho() {
		return this.tamanho;
	}

	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(",");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
