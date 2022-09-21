package friendlyNumber;

public class Main {

	public static void main(String[] args) {
		int number1 = 1180;
		int number2 = 1210;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 = total1 + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {
				total2 = total2 + i;
			}
		}

		if (number1 == total2) {
			if (number2 == total1) {
				System.out.println("Your numbers are friendly:)");

			}

		} else {
			System.out.println("Your numbers are not friendly :(  ");
		}

	}

}
