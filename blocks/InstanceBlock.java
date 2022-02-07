class InstanceBlockDemo {
	int x;
	int y;

	// below is the instance initializer block
	{
		System.out.println("instance block");
		x = 111;
		y = 222;
	}

	void display() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

class Main {
	public static void main(String args[]) {
		System.out.println("Main Method called");

		InstanceBlockDemo obj1 = new InstanceBlockDemo();
		InstanceBlockDemo obj2 = new InstanceBlockDemo();

		obj1.display();
		obj2.display();
	}
}