package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Omer";
		String ogrenci2 = "Faruk";
		String ogrenci3 = "CAN";
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = ogrenci1;
		ogrenciler[1] = ogrenci2;
		ogrenciler[2] = ogrenci3;
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		String[] ogrenciler2 = {ogrenci1, ogrenci2, ogrenci3};
		
		for (String ogrenci : ogrenciler2) {
			System.out.println(ogrenci);
		}
	}

}
