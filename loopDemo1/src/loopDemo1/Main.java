package loopDemo1;

public class Main {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i += 10) {
			System.out.println(i);
		}

		System.out.println("For Döngüsünün sonuna geldiniz :)");

		// While Döngüsü

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsünün Sonuna Geldiniz");

		// do-while döngüsü

		int j = 101;
		do {

			if (j > 100) {
				System.err.println("loglandı");

			}
			System.out.println(j);
			j += 20;
		} while (j < 100);
		System.out.println("do-while döngüsünün sonuna hoşgeldiniz");

	}

}
