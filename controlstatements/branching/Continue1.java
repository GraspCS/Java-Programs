class Continue1 {
	public static void main (String args[]) {
		for (int i = 1; i <= 20; ++i) {
			if (i == 11) {
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("Out of the loop");
	}
}