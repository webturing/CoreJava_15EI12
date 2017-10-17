package lec05;

public class Count{
    
    public static void main(String[] args){
       int n=100;
       int cnt=0;

       for(int i=1;i<=n;i++)  {
       	  if(i%3==0&&i%5==0){

                cnt+=1;
          }
      
       			
       		
       }
       System.out.println(cnt);
    }
    
}