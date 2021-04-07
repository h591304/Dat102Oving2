package no.hvl.dat102;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import no.hvl.dat102.adt.FilmarkivADT;

public class Fil {

	final static String SKILLE = "#";
	
	static FileReader fw = null;
	static BufferedReader bw = null;
	static PrintWriter pw = null;
	
	
	//Lese et Filmarkiv fra tekstfil
	public static void lesFraFil(FilmarkivADT filmarkiv, String filnavn) {
		
		try {
			
			fw = new FileReader(filnavn + ".txt");
			bw = new BufferedReader(fw);
			
			String [] Film = null;
			String linje, produsent, tittel, filmselskap;
			int filmnr, aar;
			Sjanger sjanger;
			
			while(bw.ready()) {
				
				linje = bw.readLine();
				Film = linje.split(SKILLE);
				
				filmnr = Integer.parseInt(Film[0]);
				produsent = Film[1];
				tittel = Film[2];
				aar = Integer.parseInt(Film[3]);
				sjanger = Sjanger.finnSjanger(Film[4]);
				filmselskap = Film[5];
				
				Film film = new Film(filmnr, produsent, tittel, aar, sjanger, filmselskap);
				
				filmarkiv.leggTilFilm(film);
			}
		}
		
		catch (FileNotFoundException fnfe) {
			
			System.out.println("Finner ikke filen " + filnavn + ".txt");
			
		}
		
		catch (IOException ioe) {
			
			System.out.println("Filen kan ikke leses " + ioe);
		}
	}
	
//	public static FilmarkivADT lesFraFil(String filnavn) {
//		FilmarkivADT filmer = null;
//		BufferedReader innfil = null;
//		
//		filmer = new Filmarkiv();
//		
//		return filmer;
//	}
	
	// Lagre et Filmarkiv til tekstfil
	//�pne fil, skrive ny data i fil, lukke fil
	public static void skrivTilFil(FilmarkivADT filmarkiv, String filnavn){
		
		try {
			
			pw = new PrintWriter(filnavn + ".text");
			
			Film[] film = filmarkiv.hentFilmTabell();
			int i;
			
			for(i = 0; i < filmarkiv.antall(); i++) {
				
				pw.print(film[i].getFilmnr());
				pw.print(SKILLE);
				pw.print(film[i].getProdusent());
				pw.print(SKILLE);
				pw.print(film[i].getTittel());
				pw.print(SKILLE);
				pw.print(film[i].getLanseringsAar());
				pw.print(SKILLE);
				pw.print(film[i].getSjanger());
				pw.print(SKILLE);
				pw.print(film[i].getFilmselskap());
				pw.print(SKILLE);
				
			}
			
			//Lukk filen
			pw.close();
			
		}
		
		catch(IOException e) {
			
			System.out.println("Kan ikke skrive i fil: " + filnavn + ".txt");
		}
		
	} 
	
}
