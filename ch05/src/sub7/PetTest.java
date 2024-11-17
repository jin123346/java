package sub7;

import sub6.Cat;
import sub6.Dog;
import sub6.Pet;

public class PetTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
		System.out.println();
		printSound(dog);
		printSound(cat);
		
	}
	public static void printSound(Pet pet) {
		pet.makeSound();
		System.out.println();
	}
	

}
