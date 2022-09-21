package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {
		int number = 77;
		if (number == 2) {
			System.out.println("Number is Prime.");
			return;
		}
		if (number <= 1) {
			System.out.println("You Entered an Invalid Number.");
			return;
		}

		boolean İsprime = true;

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				İsprime = false;
			}
		}

		if (İsprime) {
			System.out.println("Number is Prime.");

		} else {
			System.out.println("Number is Not Prime.");

		}

	}

}
