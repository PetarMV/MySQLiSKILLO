
/*Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user
The discount rate is
15% for the quantity purchased between 100 and 120 units, and 20% for the quantity purchased greater than
120 units. If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below
Enter unit price: 25
Enter quantity: 110
The revenue from sale:
2337.5$
After discount:
412.5$(15.0 */

import java.util.Scanner;

public class ZADACHA33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter unit price:");
		int price = sc.nextInt();

		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();

		double discountedTotal = quantity * price;

		if (quantity > 100 && quantity < 120) {
			discountedTotal = (discountedTotal * (0.85));

		}
		if (quantity >= 120) {
			discountedTotal = (discountedTotal * (0.80));

		}
		System.out.println("Total: " + discountedTotal);
		double discount = quantity * price - discountedTotal;
		System.out.println("Discount: " + discount);
	}

}
