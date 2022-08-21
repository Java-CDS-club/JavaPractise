/*	Write MusicalInstrument iterface with play method.
 	It also has common behavior (static) learnInstrument.
	Create Abstract class Sound with abstract method listenSound.

	Implement MusicalInstrument interface in PercussionInstrument and 
	StringedInstrument classes.	Also extend Sound class in both classes.

	Create object ‘Tabla’ of PercussionInstrument class and 
	object  ‘Violin’ of StringedInstrument class.
	call Paly, learnInstrument and listenSound methods of both objects.
*/

package com.test;

interface MusicalInstrument{
	void play();
	static void learnInstrument(String s) 
	{
		System.out.println("Learning Instruments "+s);
	}
}

abstract class Sound{
	public abstract void listenSound();
}

class PercussionInstrument extends Sound implements MusicalInstrument{
	public void play()
	{
		System.out.println("Music Playing..");
//		learnInstrument("tabla");
		
	}
	public void listenSound()
	{
		System.out.println("Listening sound...");
	}
}

class StringedInstrument extends Sound implements MusicalInstrument{
	public void play()
	{
		System.out.println("Music Playing..");
//		learnInstrument("violin");
	}

	public void listenSound()
	{
		System.out.println("Listening sound...");
	}
}

public class Test5Q3 {

	public static void main(String[] args) {
		PercussionInstrument tabla = new PercussionInstrument();
		tabla.play();
		MusicalInstrument.learnInstrument("tabla");
		tabla.listenSound();
		System.out.println("------------------------------");
		StringedInstrument violin = new StringedInstrument();
		violin.play();
		MusicalInstrument.learnInstrument("violin");
		violin.listenSound();


	}

}
