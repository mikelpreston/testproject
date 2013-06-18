package teststuff;

public class Buckets {
	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = {4,5,6};
		int[] z = {7,8,9};
		go(x, y, z);
		go(y, z);
		go(z);
		go2();
	}
	static void go(int[] a, int[]... b) {
		System.out.print(a[1] + " ");
	}
	
	static void go2(int[]... b) {
		System.out.print("go2 ");
	}	
}
