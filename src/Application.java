import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Application {

	public static void main(String[] args) {
		LocalTime start = LocalTime.now();
//		CheckARange car = new CheckARange();
//		car.checkARange(2, 300_000);
		Eratosthenes e = new Eratosthenes();
		e.findPrimes(31);
		LocalTime finish = LocalTime.now();
		double secondsBetween = (double) ChronoUnit.MILLIS.between(start, finish) /1000;
		System.out.println("time taken: " + secondsBetween + "s");
		System.out.println("DONE");
	}

}
