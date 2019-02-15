package Basics;

public class Aeroplane extends Flyable{
 
	public static void main(String[] args) {
		Flyable f=new Aeroplane();
		f.start();
		f.show();
		f.fly();
	}
	public void start(){
		System.out.println("abc");
	}
	public void show() {
		System.out.println("xyz");
	}
	public void fly() {
		System.out.println("adc");
	}
}
