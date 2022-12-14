package mukemmelSayiDemo;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		int bolum = 0;
		List<Integer> asalSayilar = new ArrayList<Integer>();
		asalSayilar.add(2);
		System.out.println("Sayi asaldir: 2");

		for (int i = 3; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				if (i % j == 0) {
					bolum += 1;
				}
			}

			if (bolum > 1) {
				System.out.println("Sayi asal degildir: " + i);
				bolum = 0;
			} else {
				System.out.println("Sayi asaldir: " + i);
				asalSayilar.add(i);
			}
		}

		for (int i = 0; i < asalSayilar.size(); i++) {
			System.out.println(i + 1 + ".Mukemmel sayi: "
					+ ((int) Math.pow(2, asalSayilar.get(i) - 1)) * ((int) Math.pow(2, asalSayilar.get(i)) - 1));
		}
	}
}
