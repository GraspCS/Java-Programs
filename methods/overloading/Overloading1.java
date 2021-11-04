class Calculator {
	public int sum(int a, int b) {
		return a + b;
	}

	public float sum(float a, float b) {
		return a + b;
	}

	public long sum(long a, long b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
}

class Main {
	public static void main (String args[]) {
		Calculator calc = new Calculator();
		int sum1 = calc.sum(10, 10);
		float sum2 = calc.sum(20.20f, 20.20f);
		long sum3 = calc.sum(30l, 30l);
		double sum4 = calc.sum(40.40, 40.40);

		System.out.println("Sum1 = " + sum1);
		System.out.println("Sum2 = " + sum2);
		System.out.println("Sum3 = " + sum3);
		System.out.println("Sum4 = " + sum4);
	}
}