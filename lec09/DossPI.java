package week09;

public class DossPI {
	public static void main(String[] args) {
		int N = 100000000;
		int M = 0;// ���������ڲ��ĵ����Ŀ
		for (int i = 0; i < N; i++) {
			// ����һ�������P
			double x = Math.random();
			double y = Math.random();
			if (Math.sqrt(x * x + y * y) <= 1)/* P���������� */
				++M;
		}
		double pi = 4.0 * M / N;
		System.out.println(pi);

	}
}
