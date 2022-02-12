class PrivateDemo {
	private String name;
	private int age;

	private void display() {
		System.out.println("Name :: " + name);
		System.out.println("Age :: " + age);
	}

	void setValues(String n, int a) {
		name = n;
		age = a;

		display();
	}
}

class Main {
	public static void main(String args[]) {
		PrivateDemo pd = new PrivateDemo();

		// pd.name = "John";
		// pd.age = 25;
		// pd.display();

		pd.setValues("James", 22);
	}
}