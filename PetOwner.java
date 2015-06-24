package java_study;

public class PetOwner {

	//Part of polymorphism example
	public static void main(String[] args) {
		//Instance variables
		Vet v = new Vet();
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		
		//Even though giveShot() takes param of type Animal, can pass in Dog or Cat objects b/c they are subclasses of Animal
		v.giveShot(d); 
		v.giveShot(c);
		v.giveShot(b);
	}
}
