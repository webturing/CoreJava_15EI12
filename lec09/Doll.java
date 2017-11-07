package lec09;

/**
 * Created by Administrator on 2017/11/7 0007.
 */
public class Doll {
    //抽奖模拟(赌轮算法），一等奖5% 二等奖10% 三等奖15%
    public static void main(String[] args) {
        double x=Math.random();
        if(x<=0.05){
            System.out.println("First Prize: Iphone X");
        }else if(x<=0.05+0.10){
            System.out.println("Second Prize:Red Miphone");
        }else if(x<=0.05+0.10+0.15){
            System.out.println("Third Prize:16G UDisk");
        }else{
            System.out.println("Thank you!");
        }
    }
}
