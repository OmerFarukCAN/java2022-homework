package loopDemo;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For Done!");

		int i = 1;

		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Done! i:" + i);
		
		do {
			System.out.println(i);
			i++;
		}while(i < 20);
		System.out.println("Do While Done!");
	}
}
