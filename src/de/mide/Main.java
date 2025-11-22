package de.mide;

/**
 * Klasse mit main-Methode.
 */
public class Main {

	/**
	 * Methode holt sich die Referenz auf die Singleton-Instanz
	 * des IdGenerators, fragt die nächste Id ab und schreibt
	 * diese auf die Konsole.
	 */
	private static void methode() {
		
		IdGenerator generator = IdGenerator.getSingletonInstance();
		long id = generator.naechsteId(); 
		System.out.println( "ID=" + id );
	}
	
	
	/**
	 * Einstiegsmethode.
	 * 
	 * @param args Kommandozeilenargumente, werden nicht ausgewertet
	 */
	public static void main( String[] args ) {

		System.out.println();
		
		methode();
		methode();
		
		System.out.println();
	}
	
}
