class MyCalc {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}
}

class Demo {
	public static void main(String args[]) {
		MyCalc myCalc = new MyCalc();
		int sum1 = myCalc.sum(10, 20);
		int sum2 = myCalc.sum(30, 40, 50);

		System.out.println("Sum1 = " + sum1);
		System.out.println("Sum2 = " + sum2);
	}
}