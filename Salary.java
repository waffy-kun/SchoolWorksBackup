import java.io.*;
import java.util.*;
import java.math.*;

public class Salary {
	public static void main (String [] args) {
		Scanner r=new Scanner (System.in);
		double rate;
		double hrs_worked;
		double overtime_hrs;
		double additional_pay;
		double salary;
		
		System.out.println("\nCalculation of Salary\n");
		System.out.print("Please enter rate:");
		
		rate=r.nextInt();
		
		System.out.print("\nThe pay rate is "+rate);
		System.out.println(" Php");
		System.out.println("\nOvertime hour equals 50% of pay rate");
		System.out.print("\nEnter hours worked: ");
		
		hrs_worked=r.nextInt();
		
		System.out.print("\nEnter overtime hours(if any): ");
		
		overtime_hrs=r.nextInt();
		
		additional_pay=(overtime_hrs*1.50)*rate;
		salary=(hrs_worked*rate)+additional_pay;
		
		System.out.print("\nThe salary is: "+salary);
		System.out.println(" Php");
	}
}