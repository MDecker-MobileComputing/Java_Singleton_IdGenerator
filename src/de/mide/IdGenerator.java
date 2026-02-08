package de.mide;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Generator for unique IDs. The IDs are unique, even if several processes 
 * (threads) request IDs at the same time. To ensure uniqueness, it is also 
 * necessary that there is no more than one instance of this class.
 * <br><br>
 * 
 * The following class implements the "Singleton" design pattern,
 * meaning that there can be at most one instance/object of it. 
 */
public class IdGenerator {

	/** Single long value that is incremented atomically. */
	private final AtomicLong _zaehler = new AtomicLong( 1 );

	
	/**  This class variable references the only instance of the class. */
	private static IdGenerator sSingletonInstance = null;
	

	/**
	 * The only constructor of the class is private, so that
     * the class cannot be instantiated by other classes.
	 */
	private IdGenerator() {
		
		// intentionally left blank
	}
	
	
	/**
	 * MMethod to obtain a reference to the singleton instance.
     * The singleton instance is created when needed. 
	 * 
	 * @return Singleton Instance
	 */
	public static IdGenerator getSingletonInstance() {
		
		if ( sSingletonInstance == null ) {
			
			sSingletonInstance = new IdGenerator();
		}
		
		return sSingletonInstance;
	}
	
	
	/**
	 * Method to get next ID.
	 * 
	 * @return Unique ID
	 */
    public long nextId () {
    	
        return _zaehler.incrementAndGet();
    }
}
