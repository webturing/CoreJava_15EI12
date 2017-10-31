public class P1159c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = { 100, 99, 98, 97 };
		int n = a.length;
		double avg = (sumAll(a) - max(a) - min(a)) / (n - 2);
		System.out.println(String.format("%.2f", avg));

	}

	 static int min(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	 static int max(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	static int sumAll(int[] a) {
		// int ret=0;
		// for(int i:a)
		// ret+=i;
		// return ret;
		return sumR(a, 0, a.length - 1);
	}

	static int sumR(int[] a, int start, int end) {
		if (end == start)
			return a[start];
		else
			return sumR(a, start + 1, end) + a[start];
	}

}
