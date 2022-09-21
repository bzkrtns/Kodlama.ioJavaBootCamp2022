package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 60;
		int number2 = 66;
		int number3 = 90;
		int biggest = number1;
		if (number2 > biggest) {
			biggest = number2;
		}
		if (biggest < number3) {
			biggest = number3;
		}
		System.out.println("Biggest number is = " + biggest);

	}

}
