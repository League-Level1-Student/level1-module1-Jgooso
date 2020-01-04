package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
}
	void quack() {
		System.out.println("Quack");
	}
	void waddle() {
		System.out.println("Waddle waddle");
	}
}
class Dog{
	int numberOfToys;
	String name;
	Dog(String name, int numberOfToys){
		this.name = name;
		this.numberOfToys = numberOfToys;
	}
	void bark() {
		System.out.println("Bark");
	}
	void run() {
		System.out.println("Run run");
	}
}
