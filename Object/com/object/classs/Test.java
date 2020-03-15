package com.object.classs;

abstract class Animal {
	void play(){
		System.out.println("Hii");
	}
	
	 abstract void show();
}

class Dog1 extends Animal {
	void show() {
		System.out.println("welcome");
	}
}

class Cat extends Animal {
	void show(){
		System.out.println("bye");
	}
}

public class Test {
	public static void main(String args[]) {
		Dog1 d1 = new Dog1();
		d1.show();
		d1.play();
		Animal obj = new Dog1();
		obj.show();
		obj = new Cat();
		obj.show();

	}
}