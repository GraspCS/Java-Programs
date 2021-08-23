class Method1 {
	public void printHello() {
		System.out.println("Hello");
	}

	public void printHowAreYou(String name) {
		System.out.println("How are you, " + name + "?");
	}

	public static void main(String args[]) {
		Method1 m1 = new Method1();
		m1.printHello();
		m1.printHowAreYou("Jack");
	}
}