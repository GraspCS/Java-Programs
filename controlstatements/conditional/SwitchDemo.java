class SwitchDemo {
	public static void main(String args[]) {
		char direction = 'e';

		switch (direction) {
			case 'n':
			case 'N':
				System.out.println("You are heading towards North");
				break;
			case 's':
			case 'S':
				System.out.println("You are heading towards South");
				break;
			case 'e':
			case 'E':
				System.out.println("You are heading towards East");
				break;
			case 'w':
			case 'W':
				System.out.println("You are heading towards West");
				break;
			default:
				System.out.println("Wrong direction");
		}
	}
}