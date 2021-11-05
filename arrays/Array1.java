class Employee {
	public static void main(String args[]) {
		int idsArray[] = new int[5];
		String namesArray[] = new String[5];

		idsArray[0] = 1001;
		namesArray[0] = "John";
		
		idsArray[1] = 1002;
		namesArray[1] = "James";

		idsArray[2] = 1003;
		namesArray[2] = "Jane";

		idsArray[3] = 1004;
		namesArray[3] = "Tom";

		idsArray[4] = 1005;
		namesArray[4] = "Collin";

		System.out.println("Employee Id :: " + idsArray[0] + " Name :: " + namesArray[0]);
		System.out.println("Employee Id :: " + idsArray[1] + " Name :: " + namesArray[1]);
		System.out.println("Employee Id :: " + idsArray[2] + " Name :: " + namesArray[2]);
		System.out.println("Employee Id :: " + idsArray[3] + " Name :: " + namesArray[3]);
		System.out.println("Employee Id :: " + idsArray[4] + " Name :: " + namesArray[4]);
	}
}