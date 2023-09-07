package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a year"); 
		int year = in.nextInt();
		boolean divis4 = year % 4 == 0;
		boolean divis100 = year % 100 != 0;
		boolean divis400 = year % 400 == 0;
		boolean leap = (divis4 == true && divis100 == true) || (divis400 == true);
		System.out.print(year + " is a leap year: " + leap);
		

	}

}
