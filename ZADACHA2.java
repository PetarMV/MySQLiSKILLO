//Print the perimeter of a triangle by given sides. Use formula to calculate it.

import java.util.*;

public class ZADACHA2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("This will calculate the perimeter of the triangle :");

		System.out.println("Enter side A :");
		double sideA = sc.nextDouble();

		System.out.println("Enter side B :");
		double sideB = sc.nextDouble();

		System.out.println("Enter side C :");
		double sideC = sc.nextDouble();

		double peri = sideA + sideB + sideC;

		System.out.println("Perimeter is: " + peri);
	}
}
