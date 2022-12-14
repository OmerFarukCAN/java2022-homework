package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Today the weather is good";

		System.out.println(mesaj);
		System.out.println(mesaj.length()); // spaces are included
		System.out.println(mesaj.charAt(4));
		System.out.println(mesaj.concat("!"));
		System.out.println(mesaj);

		System.out.println(mesaj.startsWith("T"));
		System.out.println(mesaj.startsWith("d", 2));
		System.out.println(mesaj.endsWith("a"));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // 5 is not included
		System.out.println(karakterler);
		System.out.println(karakterler[karakterler.length - 1]);
		
		System.out.println(mesaj.indexOf("w"));
		System.out.println(mesaj.indexOf("W"));
		System.out.println(mesaj.indexOf("t"));
		
		System.out.println(mesaj.lastIndexOf('d'));
		
		System.out.println(mesaj.replace(" ", ","));
		System.out.println(mesaj);
		
		System.out.println(mesaj.substring(6));
		System.out.println(mesaj.substring(6, 14)); // 14 is not included
		
		System.out.println("------- FOR -------");
		for (var kelimeler : mesaj.split(" ")) {
			System.out.println(kelimeler);
		}
		System.out.println("------- FOR DONE --------- ");
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());		
		
		String mesaj1 = " Today the weather is bad ";
		System.out.println(mesaj1.trim());

	}

}
