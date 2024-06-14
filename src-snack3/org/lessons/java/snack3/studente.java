package org.lessons.java.snack3;

public class studente {
	private String nome;
	private int matricola;
	private String corsoDiLaurea;

	public studente(String nome, int matricola, String corsoDiLaurea) {
		this.nome = nome;
		this.matricola = matricola;
		this.corsoDiLaurea = corsoDiLaurea;
	}

	public String toString() {
		return "Studente: " + nome + ", matricola: " + matricola + ", corso di laurea: " + corsoDiLaurea;
	}
}
