package no.hvl.dat102;

import java.util.Scanner;

import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmer;
	private String filnavn;
	
	public Meny(FilmarkivADT filmene){
		
		tekstgr = new Tekstgrensesnitt();
		this.filmer = filmene;
	
	}
	
	public static void start(){
		
		System.out.println("----------");
		System.out.println("Meny");
		System.out.println("----------");
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Vil du opprette nytt eller velge eksisterende filmarkiv");
		System.out.println("Tast 'O' for å opprette nytt filmarkiv ");
		System.out.println("Tast 'E' for eksisterende filmarkiv ");
		
		String input1 = scnr.nextLine();
		
		switch(input1) {
			
			case "O":
				System.out.println("Du har valgt å opprette nytt arkiv");
				
				break;
			
			case "E":
				System.out.println("Du har valgt et eksisterende arkiv");
				
				break;
				
			default:
				System.out.println("Feil input!!!");
				break;
		}
		
		System.out.println("'L' for å legge inn filmer");
		System.out.println("'F' for å fjerne filmer");
		System.out.println("'T' for å søke etter tittel på filmer");
		System.out.println("'P' for å søke etter produsent til filmer");
		System.out.println("'W' for å skrive ut statestikk for antall filmer");
		
		String input2 = scnr.nextLine();
		
		switch(input2) {
		
		case "L":
			System.out.println("Du har valgt å legge inn film");
			
			break;
		
		case "F":
			System.out.println("Du har valgt å fjerne en film");
			
			break;
		
		case "T":
			System.out.println("Du har valgt å søke etter tittel på en film");
			
			break;
			
		case "P":
			System.out.println("Du har valgt å søke etter produsent til en film");
			
			break;
			
		case "W":
			System.out.println("Du har valgt å skrive ut statestikk for antall filmer i arkivet");
			
			break;
		
		}
		
	}
}//class