
public class CheckIfPrime {
	boolean checkIfPrime(long input){
		boolean prime = true;
		long divisor = input - 1;
		if (input % 2 == 0) {
			prime = false;
			return prime;
		}
		else {
			while(divisor>1) {
//				System.out.println("input = " + input);
//				System.out.println("divisor = " + divisor);
				if(input % divisor == 0) {
					prime = false;
//					System.out.println(input + " is not prime");
					break;
				}
				divisor --;
			}
			if(prime == true)
				System.out.println(input);
			return prime;
		}

	}
}
