package no.hvl.dat102.klient;

import no.hvl.dat102.Filmarkiv;
import no.hvl.dat102.Meny;
import no.hvl.dat102.adt.FilmarkivADT;

public class KlientFilmarkiv {

	public static void main(String[] args) {
		//... meny
		FilmarkivADT filmer = new Filmarkiv();
		Meny meny = new Meny(filmer);
		
		Meny.start();
	}//class
	
	
}