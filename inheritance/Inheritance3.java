class X {
	public int age;
	public void display() {
		System.out.println("You are " + age + " years old");
	}
}

class Y extends X {
}

class Z extends X {
}

class Main {
	public static void main(String args[]) {
		Y y = new Y();
		Z z = new Z();

		y.age = 22;
		z.age = 24;

		y.display();
		z.display();
	}
}