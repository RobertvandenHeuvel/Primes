
public class CheckIfPrime {
	boolean checkIfPrime(long input){
		boolean prime = true;
		long divisor = 2;
			while(divisor<input) {
//				System.out.println("input = " + input);
//				System.out.println("divisor = " + divisor);
				if(input % divisor == 0) {
					prime = false;
//					System.out.println(input + " is not prime");
					break;
				}
				divisor ++;
			}
			if(prime == true)
				System.out.println(input);
			return prime;

	}
}
