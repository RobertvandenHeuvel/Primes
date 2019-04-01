
public class CheckARange {
	void checkARange(long min, long max){
		CheckIfPrime cip = new CheckIfPrime();
		long number = min;
		while(number<= max) {
			cip.checkIfPrime(number);
			number++;
		}
	}
	
}
