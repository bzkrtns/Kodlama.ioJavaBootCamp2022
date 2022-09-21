package perfectNumber;

public class Main {

	public static void main(String[] args) {
		int number = 8128;
		int total = 0;

		for (int i = 1; i < number; i++) {

			if (number % i == 0) {

				System.out.println(i);
				total = total + i;
			} else {
			}
		}
		System.out.println("The divisors of your number are listed above.");
		System.out.println("--------------------------------------------");
		if (total == number) {
			System.out.println("Your Number is the Perfect Number.");
		} else {
			System.out.println("Your Number is Not the Perfect Number.");
		}

	}

}
