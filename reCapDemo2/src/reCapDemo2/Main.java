package reCapDemo2;

public class Main {

	public static void main(String[] args) {
		
		double[] myList= {1.2,0.4,9.9,9.8,6.4};
		double total=0;
		double max = myList[0];
		double min = myList[0];
		
		
		for (double number:myList) {
		if (max<number) {
		max=number; }
		if (min>number) {min=number;}
		total = total+number;
		System.out.println(number);
			}
		
		System.out.println("Sayılarınızı toplamı = "+ total+  " etmektedir.");
		
		System.out.println("En büyük sayı "+max+" olarak belirlenmiştir.");
		
		System.out.println("En küçük sayı "+min+" olarak belirlenmiştir.");	 

	}

}
