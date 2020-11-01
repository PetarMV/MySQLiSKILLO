/*Write a program which calculates if a triangle can be built by 3 given angles. The angles are taken from the user input. 
There are two possible outputs if the triangle can’t be built based on the angle values or the triangle can be built based on the angle values. 
If the triangle is possible the output should contain also the type of the triangle acute ( остроъгълен )), 
right angled правоъгълен), obtuse ( тъпоъгълен), equilateral ( равностранен), isosceles ( равнобедрен), multifaceted ( разностранен).

Hint:Use logical and comparison operators and if statements*/

import java.util.Scanner;

public class ZADACHA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Angle 1: ");
		int angle1 = sc.nextInt();

		System.out.println("Angle 2: ");
		int angle2 = sc.nextInt();

		System.out.println("Angle 3: ");
		int angle3 = sc.nextInt();

		int sum = angle1 + angle2 + angle3;

		if (sum != 180) {
			System.out.println("This is immposible!!!");
			return;

		}

		boolean isAngle1Right = angle1 == 90;
		boolean isAngle2Right = angle2 == 90;
		boolean isAngle3Right = angle3 == 90;
		
		if (isAngle1Right || isAngle2Right || isAngle3Right) {
			System.out.println("This is triangle is right angled.");
		    return;
		}
		
		boolean isAngle1Acute = angle1 < 90;
		boolean isAngle2Acute = angle2 < 90;
		boolean isAngle3Acute = angle3 < 90;
		
		if (isAngle1Acute && isAngle2Acute && isAngle3Acute) {
			System.out.println("This is triangle is acute.");
		    ;
		}
		
		
		
		boolean isAngle1Obtuse = angle1 > 90;
		boolean isAngle2Obtuse = angle2 > 90;
		boolean isAngle3Obtuse = angle3 > 90;
		
		if (isAngle1Obtuse || isAngle2Obtuse || isAngle3Obtuse) {
			System.out.println("This is triangle is obtuse.");
		    ;
		}
		
		
		if ((angle1 == angle2) || (angle1 == angle3) || (angle2 == angle3)) {
			System.out.println("This is triangle is isosceles.");
		    ;
		}
		
		if ((angle1 == angle2) && (angle1 == angle3) && (angle2 == angle3)) {
			System.out.println("This is triangle is equilateral.");
		    ;
		}
		 
		if  ((angle1 != angle2) && (angle1!= angle3) && (angle2 != angle3)) {
			System.out.println("This is triangle is multifaceted.");
		    ;
		}
		
	
		
		
		
	}
}
