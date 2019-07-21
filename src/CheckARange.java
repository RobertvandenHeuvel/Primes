
public class CheckARange {
	void checkARange(long min, long max){
		CheckIfPrime cip = new CheckIfPrime();
		CheckIfMersenne cim = new CheckIfMersenne();
		long number = min;
		while(number<= max) {
//			cim.checkIfMersenne(number);
			cip.checkIfPrime(number);
			number++;
		}
	}
	
}
