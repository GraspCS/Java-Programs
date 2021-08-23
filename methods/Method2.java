class Method2 {
	int sum (int a, int b) {
		return a + b;
	}

	public static void main(String args[]) {
		Method2 m2 = new Method2();
		int total = m2.sum(10, 90);

		System.out.println("Total = " + total);
	}
}