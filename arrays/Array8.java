class MyJaggedArray {
	public static void main(String args[]) {
		int jArr[][] = {{11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23}};

		for (int i = 0; i < jArr.length; ++i) {
			for (int j = 0; j < jArr[i].length; ++j) {
				System.out.print("jArr["+i+"]["+j+"] = " + jArr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}