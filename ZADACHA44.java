//Find the largest number from a given array and print it in a console. Hint: use for loop.



public class ZADACHA44 {

	public static void main(String[] args) {
	
		int[] array = {2,5,1,67,785,456,354,3};
		
		int maximum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]>maximum) {
				maximum = array[i];
			}
		}
		System.out.println(maximum);

	}

}
