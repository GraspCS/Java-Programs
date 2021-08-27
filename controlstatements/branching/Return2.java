class Return2 {
	void divide(int a, int b) {
		if (b == 0) {
			System.out.println("Cannot divide by zero");
			return;
		}
		System.out.println("Division = " + (a / b));
	}

	public static void main(String args[]) {
		Return2 r2 = new Return2();
		r2.divide(10, 0);
		r2.divide(100, 10);
	}
}