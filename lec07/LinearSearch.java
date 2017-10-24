package week07;

public class LinearSearch {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 5, 6, 8, 0, 8, };
		int key = 13;
		int pos=-1;// 顺序搜索：如果key 出现在数组中则pos为key首次出现的索引，否则pos=-1		
		for ( int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				pos = i;
				break;
			}
		}
		if(pos<0)
			System.out.println("NOT FOUND!");
		else
			System.out.println(String.format("%d occured at pos=%d firstly.",key,pos));
	}
}
