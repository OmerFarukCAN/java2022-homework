package multiDimensionalArray;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[2][3];

		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Edirne";
		sehirler[0][2] = "Ankara";
		sehirler[1][0] = "Izmir";
		sehirler[1][1] = "Canakkale";
		sehirler[1][2] = "Adana";

		for (int i = 0; i < 2; i++) {
			System.out.println("-----------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

		System.out.println("Sehirler 2");

		String[][] sehirler1 = { { "Istanbul", "Edirne", "Ankara" }, 
				{ "Izmir", "Canakkale", "Adana" } };

		for (int i = 0; i < 2; i++) {
			System.out.println("-----------");
			for (int j = 0; j < 3; j++) {
				System.out.println(sehirler1[i][j]);
			}
		}
	}
}