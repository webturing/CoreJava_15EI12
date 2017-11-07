package week09;

public class RandomTool {
	static int coin() {// 0 or 1
		return (int) (Math.random() * 2);
	}

	static int doss() {// 1-6
		return (int) (Math.random() * 6) + 1;
	}

	static int doss(int start, int end) {
		return (int) (Math.random() * (end - start + 1)) + start;
	}
	static int[] luckyMoney(int total,int money)
	{
		int m[]=new int[total];
		//TODO
		
		return m;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.print(coin());
		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print(doss());
		System.out.println();
		for (int i = 0; i < 10; i++)
			System.out.print(doss(0, 51) + " ");
	}
}
