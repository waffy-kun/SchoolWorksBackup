import java.io.*;
import java.util.*;

public class InvertedPyramid {
	public static void main (String args []) {
	Scanner r=new Scanner(System.in);
	
	int rows;
	System.out.print("Enter rows: ");
	rows=r.nextInt();
	
		for(int i=rows; i>=1; --i) {
			for(int space=0; space < rows-i; space++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; ++j) {
				System.out.print("* ");
			}
			for(int j=0; j<i-1; ++j) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}