package no.hvl.dat102.adt;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;

public interface FilmarkivADT {

	// Returnere en tabell av Filmer
	Film[] hentFilmTabell();
	
	// Legger til en ny Film
	void leggTilFilm(Film nyFilm);
	
	// Sletter en Film hvis den fins 
	boolean slettFilm(int filmnr);
	
	// S�ker og henter Film er med en gitt delstreng
	Film[] soekTittel(String delstreng);
	
	// S�ker og henter produsenter med en gitt delstreng
	Film[] soekProdusent(String delstreng);
	
	// Henter antall Film er for en gitt sjanger 
	int antall(Sjanger sjanger);
	
	// Returnerer antall Filmer
	int antall();

}//interface 
