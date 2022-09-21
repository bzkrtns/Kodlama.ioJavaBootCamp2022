package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String mesaj2 = "    Bugün hava çok güzelmiş.     ";
		System.out.println(mesaj);
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5.eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" YAŞASIN!"));
		System.out.println(mesaj.startsWith("u"));
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));
		System.out.println(mesaj.lastIndexOf("."));

		System.out.println("-----------");
		// 2.kısım
		String yeniMesaj = mesaj.replace(' ', '_');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(5, 10));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj2.trim());

	}

}
