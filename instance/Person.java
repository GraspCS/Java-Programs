class Person {
	String name;
	int age;

	public void display() {
		System.out.println("Name = " + name + " and Age = " + age);
	}
}

class Main {
	public static void main(String args[]){
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "John";
		p1.age = 24;

		p2.name = "Alex";
		p2.age = 22;

		p1.display();
		p2.display();
	}
}