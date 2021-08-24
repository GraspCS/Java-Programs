import java.util.Scanner;

class While2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n 0 to exit, 1 to continue loop \n");
		System.out.print("Enter your choice = ");
		int choice = sc.nextInt();

		while (choice != 0) {
			System.out.println("\n Loop is working \n");
			System.out.print("Enter your choice = ");
			choice = sc.nextInt();			
		}
		
	}
}