package Practice_capg;

public class App {

	public static void main(String[] args) {
		try {
			throw new CustException();
		}
catch(CustException e) {
	System.out.println(e);
}

}
}