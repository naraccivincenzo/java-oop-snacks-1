package org.lessons.java.snack3;

public class registroStudenti {
	private studente[] studenti;
	private int counter;

	public registroStudenti() {
		this.studenti = new studente[100];
		this.counter = 0;
	}

	public void aggiungiStudente(studente studente) {
		if (counter < studenti.length) {
			studenti[counter] = studente;
			counter++;
		} else {
			System.out.println("Registro pieno, impossibile aggiungere altri studenti.");
		}
	}

	public void stampaStudenti() {
		if (counter == 0) {
			System.out.println("Il registro è vuoto.");
		} else {
			for (int i = 0; i < counter; i++) {
				System.out.println(studenti[i]);
			}
		}
	}

	public static void main(String[] args) {
		registroStudenti registro = new registroStudenti();

		studente studente1 = new studente("Pasquale", 123, "Informatica");
		studente studente2 = new studente("Giacinto", 456, "Elettronica");

		registro.aggiungiStudente(studente1);
		registro.aggiungiStudente(studente2);

		registro.stampaStudenti();
	}
}
