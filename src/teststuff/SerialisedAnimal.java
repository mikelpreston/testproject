package teststuff;
import java.io.Serializable;

import static teststuff.InterfaceWithValues.*;

public class SerialisedAnimal implements Serializable {
	private int animalId;
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
		
		int foo = CONSTANT_INT;
	}
	
	static class Doggy
	{
		
	}	
}

class Dog extends SerialisedAnimal
{
	private int dogid;
}


