import java.util.Scanner;//����Scanner��Ķ��� ������ #include<xxx.h>

public class AAddB {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//����һ��ɨ�������󣬿��Դӱ�׼�����и�ʽ����ȡ������ֵ
		int a=scanner.nextInt();//��ȡ�������е�ֵ
		int b=scanner.nextInt();
		System.out.println(a+b);
		scanner.close();//�ر�ɨ��������		
	}
}
