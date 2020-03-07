import java.io.*;
import java.util.*;
import java.math.*;

public class Conversion {
	public static void main (String [] args) {
		Scanner r=new Scanner (System.in);
		double gal;
		double lbs=8.35;
		double result;
		
		System.out.println("\nConversion from US Gallons(gal) of Water to Pounds(lbs) of Water\n");
		System.out.print("Please enter gallons of water:");
		gal=r.nextInt();
		
		result=gal*lbs;
		
		System.out.print(+gal);
		System.out.print(" gal. of H20 converts to ");
		System.out.print(+result);
		System.out.println(" lbs. of H20");
	}
}