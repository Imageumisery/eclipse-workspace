package arrays;

public class Array2 {

	public static void main(String[] args) {
		 int[][] mArray1 = new int [20] [20];
		 
		for (int i = 0; i < 20; i++) {
			mArray1 [i] [i] = i;
			if (i == 19) {
				System.out.print(mArray1 [i] [i] + ". "  );
				break;
				
				}
			System.out.print(mArray1 [i] [i] + ", "  );
		}
		}

	}

