/*Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to work. A person
who is eligible to work must be older than or equal to 16 years old
Example:
Enter your age:
16
You are eligible to work.*/

import java.util.Scanner;

public class ZADACHA22 {

	public static void main(String[] Strings) {

		Scanner x = new Scanner(System.in);
		System.out.println("Please enter your age :");
		int age = x.nextInt();
		if (age >= 16) {
			System.out.println("The person is eligible to work.");
		}
		if (age < 16) {
			System.out.println("The person is not eligible to work.");
		}
		
	}

}

