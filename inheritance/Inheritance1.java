class Base {
	public int a;
	public int b;
	public int sum () {
		return a + b;
	}
}

class Derived extends Base {
}

class Main {
	public static void main(String args[]) {
		Derived d = new Derived();
		d.a = 10;
		d.b = 20;
		System.out.println("Sum = " + d.sum());
	}
}