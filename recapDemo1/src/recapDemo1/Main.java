package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 27;
		int sayi3 = 26;
		
		int enBuyukSayi = sayi1;
		
		if (enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		
		if (enBuyukSayi < sayi3 ) {
			enBuyukSayi = sayi3;
		}
		
		System.out.println(enBuyukSayi);
	}
}
