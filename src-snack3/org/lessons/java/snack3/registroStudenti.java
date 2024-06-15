package org.lessons.java.snack3;

public class registroStudenti {
    private studente[] studenti;

    public registroStudenti() {
        this.studenti = new studente[0];
    }

    public void aggiungiStudente(studente studente) {
        studente[] nuoviStudenti = new studente[this.studenti.length + 1];
        for (int i = 0; i < this.studenti.length; i++) {
            nuoviStudenti[i] = this.studenti[i];
        }
        nuoviStudenti[nuoviStudenti.length - 1] = studente;
        this.studenti = nuoviStudenti;
    }

    public void stampaStudenti() {
        if (this.studenti.length == 0) {
            System.out.println("Il registro è vuoto.");
        } else {
            for (int i = 0; i < this.studenti.length; i++) {
                System.out.println(studenti[i].getInfo());
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
