package arrays;

public class Array1 {
	public static void main(String[] args) {
	
		int [] arr1 = {1, 3, 5, 7, 9};
		for (int i = 0; i < 4; i++) {
			if (i == 3) { 
				System.out.print(arr1 [i]+ ". "  );
				break;
			}
			System.out.print(arr1[i] + ", ");
		}
}

}
