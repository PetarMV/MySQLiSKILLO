/*Given a list iterate it and display numbers which are divisible by 5 and if you find number greater than 150 stop the loop
iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200*/



public class ZADACHA66 {

	public static void main(String[] args) {
	
		int[] array = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		
		int maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			int left = array[i]%5;
			if (left==0) {
				System.out.println(array[i]);
			}
			if(array[i]>=150) {
				System.out.println("Returning because of " + array[i]);
				return;
			}
		}
		System.out.println(maximum);

	}

}
