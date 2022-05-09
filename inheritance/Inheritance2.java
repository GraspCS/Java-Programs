class A {
	public int a;
}

class B extends A {
	public int b;
}

class C extends B {
	public void sum() {
		System.out.println("a + b = " + (a + b));
	}
}

class Main {
	public static void main(String args[]) {
		C obj = new C();
		obj.a = 50;
		obj.b = 50;
		obj.sum();
	}
}