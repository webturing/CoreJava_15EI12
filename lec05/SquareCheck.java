public class SquareCheck{
    
    public static void main(String[] args){
       int n=99;
       boolean find=false;

       for(int i=1;i<=n;i++)  {
       	  if(i*i==n){
                find=true;
                break;
          }          			
       		
       }
       System.out.println(find);
    }
    
}