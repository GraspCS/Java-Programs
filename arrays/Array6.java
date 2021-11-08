class My2DArray{
	public static void main(String args[]) {
		int myArr[][] = {{11, 12, 13, 14}, {15, 16, 17, 18}, {19, 20, 21, 22}};

		for (int i = 0; i < myArr.length; ++i) {
			for(int j = 0; j < myArr[i].length; ++j) {
				System.out.print("myArr["+i+"]["+j+"] = " + myArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}