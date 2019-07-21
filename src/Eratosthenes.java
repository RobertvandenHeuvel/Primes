import java.util.ArrayList;

public class Eratosthenes {
	void findPrimes(int max) {
		int range = max - 2;
		boolean [] booleanArray = fillBooleanArray(range);
		booleanArray = sieve(max, booleanArray);
		printPrimes(booleanArray);
	}

	void printPrimes(boolean[] booleanArray) {
		for(int i = 0; i<booleanArray.length;i++) {
			if(booleanArray[i]==true)
			System.out.println(i+2);
		}
	}

	boolean[] sieve(int max, boolean[] booleanArray) {
		for (int i = 2; i <= Math.sqrt(max); i++) {
			if (booleanArray[i - 2] == true) {
				for (int j = i * i; j < max; j += i) {
					booleanArray[j-2] = false;
				}
			}
		}
		return booleanArray;
	}

	boolean[] fillBooleanArray(int range) {
		boolean[] booleanArray = new boolean[range];
		for (int i = 0; i < booleanArray.length; i++) {
			booleanArray[i] = true;
		}
		return booleanArray;
	}
}
