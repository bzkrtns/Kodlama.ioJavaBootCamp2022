package findNumbers;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int lookingFor = 8;
		boolean isItIn = false;

		for (int number : numbers) {

			if (number == lookingFor) {
				isItIn = true;
				break;
			}
		}

		if (isItIn == true) {
			System.out.println("Number is in the series.");
		} else {
			System.out.println("Number is not in the series.");
		}

	}

}
