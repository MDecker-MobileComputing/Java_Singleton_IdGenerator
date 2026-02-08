package de.mide;

/**
 * Class with main method
 */
public class Main {

	/**
	 * The method retrieves the reference to the singleton instance of the IdGenerator, 
	 * queries the next Id, and writes it to the console.
	 */
	private static void method() {
		
		IdGenerator generator = IdGenerator.getSingletonInstance();
		long id = generator.nextId(); 
		System.out.println( "ID=" + id );
	}
	
	
	/**
	 * Entry method
	 * 
	 * @param args Comnmand line arguments are not evaluated
	 */
	public static void main( String[] args ) {

		System.out.println();
		
		method();
		method();
		
		System.out.println();
	}
	
}
