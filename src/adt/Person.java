package adt;

public class Person implements Human {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Hello, my name is "+name);
		System.out.println("I'm "+age +" years old.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating...");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Working...");
	}
}
