import java.util.Scanner;

class TheEmployee {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);

		int idsArray[] = new int[5];
		String namesArray[] = new String[5];

		for (int i = 0; i < idsArray.length; ++i) {
			System.out.println("\nEmployee " + (i + 1) + "\n");

			System.out.print("Enter Id :: ");
			idsArray[i] = sc.nextInt();

			System.out.print("Enter Name :: ");
			namesArray[i] = sc.next();
		}

		System.out.println("\n\nBelow information is entered\n\n");
		for (int i = 0; i < idsArray.length; ++i) {
			System.out.println("Employee Id :: " + idsArray[i] + " Name :: " + namesArray[i]);
		}
	}
}