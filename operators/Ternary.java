class Ternary {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int c = a > b ? 100 : 1000;

		System.out.println(c);

		int x = 20;
		int y = 40;
		int z = x < y ? x * 2 : y / 2;
		System.out.println(z);
	}
}