package _06_duck;

public class DuckRunner {
	public static void main(String[] args) {
		Duck duck = new Duck("y", 0);
		duck.quack();
		duck.waddle();
		Dog dog = new Dog("y", 0);
		dog.bark();
		dog.run();
	}
}
