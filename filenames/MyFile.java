class AnotherClass {
	void printHello() {
		System.out.println("Hello from Another Class");
	}
}

class MyClass {
	public static void main(String args[]) {
		System.out.println("Hello from My Class");
		
		// Create object of AnotherClass
		AnotherClass another = new AnotherClass();
		
		// Call the method
		another.printHello();
	}
}