package Practice_capg;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Start");
int arr[]= {1,2,3,4,5};
try {
//System.out.println(2/0);
System.out.println(arr[7]);
} catch(ArithmeticException e) {
	System.out.println(e);
}
/*catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
}
*/
System.out.println("End");

	}

}
