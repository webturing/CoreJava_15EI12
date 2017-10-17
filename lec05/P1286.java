package lec05;

public class P1286{
    public static void main(String[] args){
       for(int m=31;m<=99;m++){
       		int n=m*m;
       		int high=n/100,low=n%100;
   			if(high%11==0&&low%11==0)
   				System.out.println(n);       	
       }
    }
    
}