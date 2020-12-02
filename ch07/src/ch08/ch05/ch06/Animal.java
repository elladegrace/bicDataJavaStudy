package ch08.ch05.ch06;

public class Animal {
	void say() {}
}

class Dog extends Animal{
	void say() {System.out.println("멍멍");}
}
class Cat extends Animal{
	void say() {System.out.println("야옹");}
}
