public class SquareCheck2{
    
    public static void main(String[] args){
      for(int n=1;n<=100;n++){
        boolean find=false;
        for(int i=1;i<=n;i++){
          if(i*i==n){
            find=true;
            break;
          }
        }
      if(find)
        System.out.println(n);
      }

    }
    
}