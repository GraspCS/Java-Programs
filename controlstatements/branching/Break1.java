class Break1 {
	public static void main(String args[]) {
		for (int i = 1; i <= 100; ++i) {
			if (i == 11) {
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("Out of the loop");
	}
}