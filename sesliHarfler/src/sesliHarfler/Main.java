package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';

		char harf2 = Character.toLowerCase(harf);

		switch (harf2) {

		case 'a':
		case 'ı':
		case 'o':
		case 'u':

			System.out.println("Harfiniz Kalın Sesli Bir Harftir.");
			break;

		case 'e':
		case 'i':
		case 'ö':
		case 'ü':

			System.out.println("Harfiniz İnce Sesli Bir Harftir.");
			return;

		default:
			System.out.println("Lütfen Sesli Bir Harf Giriniz.");

		}
	}

}
