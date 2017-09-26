import java.util.Scanner;//引入Scanner类的定义 类似于 #include<xxx.h>

public class AAddB {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);//创建一个扫描器对象，可以从标准输入中格式化读取变量的值
		int a=scanner.nextInt();//读取输入流中的值
		int b=scanner.nextInt();
		System.out.println(a+b);
		scanner.close();//关闭扫描器对象		
	}
}
