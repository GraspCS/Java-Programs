class IfElseLadder {
	public static void main(String args[]) {
		int numberOfStudents = 4;
		if (numberOfStudents <= 2) {
			System.out.println("You need a bike");
		} else if (numberOfStudents <= 5) {
			System.out.println("You need a car");
		} else if (numberOfStudents <= 15) {
			System.out.println("You need a mini-bus");
		} else {
			System.out.println("You need a bus");
		}
	}
}