package asalSayiDemo;

public class Main {

	public static void main(String[] args) {
		int sayi = 13;
		int bolum = 0;

		for (int i = 2; i < sayi; i++) {
			if (sayi % i == 0) {
				bolum += 1;
			}
		}

		if (sayi < 1) {
			System.out.println("1 den kucuk sayilar asal degildir.");
		} else if (bolum == 0 && sayi != 1) {
			System.out.println("Sayi Asaldir: " + sayi);
		} else {
			System.out.println("Sayi Asal Degildir: " + sayi);
		}
	}
}