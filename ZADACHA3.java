//Print the area of a triangle by given sides. Use formula to calculate it.



import java.util.Scanner;

public class ZADACHA3 {

 	
	int height;
	int length;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("This will calculate the area of the triangle :");
		
		System.out.println("Enter height:");
		double height = sc.nextDouble();
		
		System.out.println("Enter length:");
		double length = sc.nextDouble();
		
         System.out.println("Triangle area is: " + (height * length)/2);
			
	}

}
