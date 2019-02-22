package Package1;

import java.util.*;

public class Currency_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency c1 = Currency.getInstance("AUD");
		Currency c2 = Currency.getInstance("JPY");
		Currency c3 = Currency.getInstance("USD");
          System.out.println(c1.getCurrencyCode());
          System.out.println(c1.getDefaultFractionDigits());
          System.out.println(c1.getSymbol());
          
          System.out.println(c2.getCurrencyCode());
          System.out.println(c2.getDefaultFractionDigits());
          System.out.println(c2.getSymbol());
          
          System.out.println(c3.getCurrencyCode());
          System.out.println(c3.getDefaultFractionDigits());
          System.out.println(c3.getSymbol());
       
	}

}
