// Reverse the following list using for loop list1 = [10, 20, 30, 40,]




public class ZADACHA77 {

	public static void main(String[] args) {
		
		int[] array1 = {10,20,30,40, 50};
		int[] arrayReversed = new int[array1.length];
		for (int i = 0; i < array1.length; i++) {
			arrayReversed[array1.length - i - 1] = array1[i];
		}
		
		
		for (int j = 0; j < arrayReversed.length; j++) {
			int i = arrayReversed[j];
			System.out.println(i);
		}
		
	}

}
