class StaticVariable {
	int x;
	static int y;
}

class Main {
	public static void main(String args[]) {
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		StaticVariable sv3 = new StaticVariable();

		sv1.x = 100;
		sv1.y = 111;

		sv2.x = 200;
		sv2.y = 222;

		sv3.x = 300;
		sv3.y = 333;

		System.out.println("Instance Variable \n");
		System.out.println("sv1.x = " + sv1.x);
		System.out.println("sv2.x = " + sv2.x);
		System.out.println("sv3.x = " + sv3.x);

		System.out.println("\n\nStatic Variable \n");
		System.out.println("sv1.y = " + sv1.y);
		System.out.println("sv2.y = " + sv2.y);
		System.out.println("sv3.y = " + sv3.y);
	}
}