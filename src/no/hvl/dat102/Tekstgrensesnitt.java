package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Tekstgrensesnitt {

	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm() {
		
	return null;
	}
	
	// vise en film med alle opplysninger p� skjerm (husk tekst for sjanger)
	
	public void visFilm(Film film) {
		
		System.out.println(film.getFilmnr() + "\n" + film.getProdusent() + "\n" + film.getTittel() + "\n" + 
		film.getLanseringsAar() + "\n" + film.getSjanger() + "\n" + film.getFilmselskap());
		
	}
	
	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filmer, String delstreng) {
		
		Film[] film = filmer.soekTittel(delstreng);
		int i;
		
		for(i = 0; i < film.length; i++) {
			if(film[i] != null) {
				System.out.println(film[i].getTittel() + "har en tittel med en spesiell delstreng");
			}
		}
	}
	
	// Skriver ut alle Filmer av en produsent/ en gruppe 
	
	public void skrivUtFilmProdusent(FilmarkivADT filmer, String delstreng) {
		
		Film[] film = filmer.soekProdusent(delstreng);
		int i;
		
		for(i = 0; i < film.length; i++) {
			if(film[i] != null) {
				System.out.println(film[i].getTittel() + " har produsenten/ gruppen: " + film[i].getProdusent());
			}
		}
	} 
	
	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt 
	// og hvor mange det er i hver sjanger
	
	public void skrivUtStatistikk(FilmarkivADT filmer) {
		
		Sjanger[] sjanger = Sjanger.values();
		int[] antSjang = new int[sjanger.length];
		int antFilm = filmer.antall();
		
		System.out.println("Antall filmer: " + antFilm);
		
		int i;
		for(i = 0; i < sjanger.length; i++) {
			
			antSjang[i] = filmer.antall(sjanger[i]);
			System.out.println(sjanger[i] + " " + antSjang[i]);
			
		} 
		
	}

	//... Ev. andre metoder

}//class



