package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'D';

		switch (grade) {
		case 'A':
			System.out.println("Çok iyi Geçtiniz");
			break;
		case 'B':
			System.out.println("İyi Geçtiniz");
			break;
		case 'C':
			System.out.println("Fena değil Geçtiniz");
			break;
		case 'D':
			System.out.println("Şanslısınız Geçtiniz");
			break;

		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;

		default:
			System.out.println("Geçersiz Bir Not Girişi Yaptınız");
		}
	}

}
