package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'f';

		switch (grade) {
		case 'A':
			System.out.println("Perfect");
			break;
		case 'B':
			System.out.println("Good");
			break;
		case 'C':
			System.out.println("Not bad");
			break;
		case 'F':
			System.out.println("Bad");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}
}
