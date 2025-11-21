package de.mide;

/**
 * Klasse mit main-Methode.
 */
public class Main {

	private static void methode() {
		
		IdGenerator generator = IdGenerator.getSingletonInstance();
		long id = generator.naechsteId(); 
		System.out.println( "ID=" + id );
	}
	
	
	public static void main( String[] args ) {

		System.out.println();
		
		methode();
		methode();
		
		System.out.println();
	}
	
}
