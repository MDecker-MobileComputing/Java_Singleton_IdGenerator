package de.mide;

import java.util.concurrent.atomic.AtomicLong;


/**
 * Generator für eindeutige IDs. Die IDs sind eindeutig, auch wenn mehrere
 * Prozesse (Threads) gleichzeitig IDs anfordern. Für die Eindeutigkeit
 * ist es auch erforderlich, dass es nicht mehr als eine Instanz von
 * dieser Klasse gibt.
 * <br><br>
 * 
 * Die folgende Klasse setzt das Entwurfsmuster "Singleton" (Einzelstück)
 *  um, es kann von ihr also höchstens eine Instanz/Objekt geben. 
 */
public class IdGenerator {

	/** Einzelner Long-Wert, der atomar erhöht wird. */
	private final AtomicLong _zaehler = new AtomicLong( 1 );

	
	/** 
	 * Diese Klassenvariable referenziert die einzige Instanz
	 * der Klasse.
	 */
	private static IdGenerator sSingletonInstance = null;
	

	/**
	 * Der einzige Konstruktor der Klasse ist privat, so dass
	 * die Klasse nicht von anderen Klassen instanziiert werden
	 * kann.
	 */
	private IdGenerator() {
		
		// absichtichtlich leer gelassen
	}
	
	
	/**
	 * Methode, um Referenz auf Singleton-Instanz zu bekommen.
	 * Die Singleton-Instanz wird bei Bedarf erzeugt. 
	 * 
	 * @return Singleton-Instanz 
	 */
	public static IdGenerator getSingletonInstance() {
		
		if ( sSingletonInstance == null ) {
			
			sSingletonInstance = new IdGenerator();
		}
		
		return sSingletonInstance;
	}
	
	
	/**
	 * Methode, um die nächste ID abzurufen.
	 * 
	 * @return Eindeutige ID
	 */
    public long naechsteId () {
    	
        return _zaehler.incrementAndGet();
    }
}
