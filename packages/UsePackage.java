import com.graspcs.java.PackageDemo;

class UsePackage {
	public static void main(String args[]) {
		PackageDemo pd = new PackageDemo();
		int total = pd.add(20, 20);
		System.out.println("Total = " + total);
	}
}