package arrayDeepDive;

public class exploreArray {

	public static void main(String[] args) {
		// Create Array of Type Integer
		int[] arrayInt = {1,3,4,6,7};
		
		// Print first element i.e 0th index in array 
		System.out.println(arrayInt[0]);
		
		// Creating Integer Array by length or size
		int[] newIntArray = new int[6];
		int arrLength = newIntArray.length;
		
		// Adding elements to above created array
		for(int i =0; i<arrLength; i++) {
			newIntArray[i] = i;
		}
		
		// Print all elements in the array
		for(Integer value: newIntArray) {
			System.out.println(value);
		}
		
		
		// Create Array of Type String
		String[] arrayString = {"stella", "ramesh", "rajesh", "priya"};
		
		// Replace element of index 3
		arrayString[3] = "rahul";
		System.out.println(arrayString[3]);
		
		// Create Array of Type Boolean
		boolean[] arrayBool = {true, false, false, true};
		System.out.println(arrayBool[2]);
		
	}
}
