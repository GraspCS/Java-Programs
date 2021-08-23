import java.util.Scanner;

class ScannerDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter you name = ");
		String name = sc.next();

		System.out.print("Enter your age = ");
		int age = sc.nextInt();

		sc.nextLine(); // put here purposefully

		System.out.print("Tell me your favorite quote = ");
		String quote = sc.nextLine();

		System.out.println("\nHere is what I got\n");
		System.out.println("Your name is " + name);
		System.out.println("You are " + age + " years old");
		System.out.println("Your favorite quote is \"" + quote + "\"");
	}
}