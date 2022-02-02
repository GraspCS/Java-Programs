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
		sv2.x = 200;
		sv3.x = 300;

		StaticVariable.y = 999;

		System.out.println("Instance Variable \n");
		System.out.println("sv1.x = " + sv1.x);
		System.out.println("sv2.x = " + sv2.x);
		System.out.println("sv3.x = " + sv3.x);

		System.out.println("\n\nStatic Variable \n");
		System.out.println("StaticVariable.y = " + StaticVariable.y);
	}
}