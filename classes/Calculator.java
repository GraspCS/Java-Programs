class Calculator {
	private int a = 100;
	private int b = 10;

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}
}

class Main {
	public static void main (String args[]) {

		Calculator obj = new Calculator();
		int sum = obj.add();
		int difference = obj.sub();

		System.out.println("Sum = " + sum);
		System.out.println("Difference = " + difference);

		// System.out.println(a); // <------ It will throw compile time error
		// int s = add(); // <------ It will also throw compile time error
		// System.out.println(obj.a); // <------ It will also throw compile time error

	}
}