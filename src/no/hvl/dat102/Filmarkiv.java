package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT{
	
	final static int STDK = 100;
	private Film[] filmTabell;
	private int antall;

	public Filmarkiv(int n) {
		
		filmTabell = new Film[n];
		antall = 0;
		
	}
	
	public Filmarkiv() {
		this(STDK);
		
	}
	
	@Override
	public Film[] hentFilmTabell() {
		
		filmTabell = new Film[antall];
		return filmTabell;
	}

	@Override
	public void leggTilFilm(Film nyFilm) {

		filmTabell[antall] = nyFilm;
		antall++;
		
	}

	@Override
	public boolean slettFilm(int filmnr) {

		boolean slettFilm = false;
		int i;
		
		for(i = 0; i < antall; i++) {
			if(filmTabell[i].getFilmnr() == filmnr) {
				filmTabell[i] = filmTabell[antall - 1];
				filmTabell[i] = null;
				antall--;
				slettFilm = true;
			}
		}
		return slettFilm;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		
		int ant = 0;
		int i;
		Film[] filmTab = new Film[filmTabell.length];
		
		for(i = 0; i  < filmTabell.length; i++) {
			if(filmTabell[i].getTittel().contains(delstreng)) {
				
				filmTab[ant] = filmTabell[i];
				ant++;
				
			} 
		}
		trimTab(filmTab, ant);
		return filmTab;
	}

	@Override
	public Film[] soekProdusent(String delstreng) {
		
		int ant = 0;
		int i;
		Film[] nyFilmTab = new Film[filmTabell.length];
		
		for(i = 0; i  < filmTabell.length; i++) {
			if(filmTabell[i].getProdusent().contains(delstreng)) {
				
				nyFilmTab[ant] = filmTabell[i];
				ant++;
				
			} 
		}
		trimTab(nyFilmTab, ant);
		return nyFilmTab;
	}

	@Override
	public int antall(Sjanger sjanger) {
		
		int antallSjanger = 0;
		int i;
		
		for(i = 0; i < filmTabell.length; i++) {
			if(filmTabell[i].getSjanger() == sjanger) {
				
				antallSjanger++;
				
			}
		}
		return antallSjanger;
	} 

	@Override
	public int antall() {
		
		return antall;
	}
	
	private Film[] trimTab(Film[] tab, int n) {		// n er antall elementer
		Film[] filmtab2 = new Film[n];
		int i= 0; 
		while (i < n) {
			filmtab2[i] = tab[i];
			i++;
		}	//while
		return filmtab2;
	}

}
