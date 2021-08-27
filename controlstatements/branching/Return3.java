class Return3 {
	int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String args[]) {
		Return3 r3 = new Return3();
		int product = r3.multiply(20, 20);
		System.out.println("Product = " + product);
	}
}