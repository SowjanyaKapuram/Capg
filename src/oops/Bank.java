package oops;

public class Bank {
	int accno;
	int bal;
	Bank(){
		System.out.println("constructor called");
	}

	public Bank(int accno, int bal) {
		this();
		this.accno=accno;
		this.bal=bal;
		System.out.println(accno+" "+bal);
		new Bank();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1= new Bank();
		Bank b2= new Bank(20,300);
		Bank b3= new Bank();
		new Bank();
	}

}
