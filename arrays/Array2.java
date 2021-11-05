class Array2 {
	public static void main(String args[]) {
		int[] mArray = new int[10];

		for (int i = 0; i < mArray.length; ++i) {
			mArray[i] = (i + 1) * 100;
		}

		for (int i = 0; i < mArray.length; ++i) {
			System.out.println("mArray[" + i + "] = " + mArray[i]);
		}
	}
}