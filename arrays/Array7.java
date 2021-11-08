class My2DArray{
	public static void main(String args[]) {
		int myArr[][] = {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}};

		for(int arr[]: myArr) {
			for(int e: arr) {
				System.out.print(e + "\t");
			}
			System.out.println();
		}
	}
}