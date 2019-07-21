
public class CheckIfMersenne {
	boolean checkIfMersenne(long input) {
		CheckIfPrime cip = new CheckIfPrime();
		double exponent = 1;
		boolean mersenne = false;
		long mersenneCalc = 1;
		boolean prime = cip.checkIfPrime(input);
		if (prime == true) {
			while (mersenneCalc < input) {
				mersenneCalc = (long) (Math.pow(2, exponent) - 1);
				if (mersenneCalc == input) {
					mersenne = true;
					System.out.println(input + " = 2^" + (long) exponent + " - 1");
					return mersenne;
				}
				exponent++;
			}
			//System.out.println(input + ": prime but not mersenne");
			return mersenne;
		}
		return mersenne;
	}

}
