package Basics;

public class Calculator implements Operations{

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.sub();
	}
public void add() {
	System.out.println("add");
}
public void sub() {
	System.out.println("sub");
}
	}


