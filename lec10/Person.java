package week10;

public class Person {
	//static method VS member method
	public static void foo()
	{
		
	}
	public static Person GOD = new Person();

	public void eat() {
		// TODO Auto-generated method stub

	}

	public void cry() {
		// TODO Auto-generated method stub

	}

	public void complain() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Person baby=null ;//= new Person();// birth		
		//baby.cry();
		//baby.complain();
		baby.foo();//call static method 
		//baby.eat();//call member method
		

	}
}
