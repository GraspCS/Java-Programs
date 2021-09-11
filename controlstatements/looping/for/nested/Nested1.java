class Nested1 {
	public static void main(String args[]) {
		for (int i = 1; i <= 3; ++i) {
			System.out.println("Outer for loop i = " + i + "\n");
			for (int j = 1; j <= 5; ++j) {
				System.out.println("Inner for loop j = " +j);
			}
			System.out.println();
		}
	}
}