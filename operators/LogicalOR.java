class LogicalOR {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = 5;

		System.out.println(a < b || a > c); // prints true

		System.out.println(a < b || a == c); // prints true

		System.out.println(a > b || a == c); // prints false
	}
}