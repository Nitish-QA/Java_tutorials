package Java_oopsConcepts;

public class classTypecasting {
	
	
	    public void makeSound() {
	        System.out.println("Animal is making a sound");
	    }
	

	class Dog extends classTypecasting { 
	    public void makeSound() {
	        System.out.println("Dog is barking");
	    }

	    public void fetch() {
	        System.out.println("Dog is fetching");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        // Upcasting
	    	classTypecasting typecastingclass = new classTypecasting();
	    	typecastingclass.makeSound(); // Output: Dog is barking

	        // Downcasting
	        Dog dog = (Dog) typecastingclass;
	        dog.makeSound(); // Output: Dog is barking
	        dog.fetch(); // Output: Dog is fetching

	        // Incorrect downcasting
	        classTypecasting animal2 = new classTypecasting();
	        Dog dog2 = (Dog) animal2; // This will result in a ClassCastException at runtime
	    }
	}

}
