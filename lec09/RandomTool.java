package lec09;

import java.util.Arrays;

public class RandomTool {
    /**
     *模拟硬币
     * @return
     */

    static int coin() {// 0 or 1
        return (int) (Math.random() * 2);
    }

    /**
     *模拟骰子
     * @return
     */
    static int doss() {// 1-6
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * 产生任意制定范围的[start,end]之间均匀分布的整数
     * @param start
     * @param end
     * @return
     */
    static int doss(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }

    /**
     *
     * @param total
     * @param money
     * @return
     */
    static int[] luckyMoney(int total, int money) {
        if (money < total)
            return null;
        int m[] = new int[total];
        for (int i = 0; i < total ; i++) {
            m[i] += doss(1, money-i);
            money -= m[i];
        }
        m[total - 1] += money;
        return m;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.print(coin());//模拟抛硬币
        System.out.println();
        for (int i = 0; i < 10; i++)
            System.out.print(doss());//模拟掷骰子
        System.out.println();
        for (int i = 0; i < 10; i++)//模拟扑克牌，可以用x/13代表花色，x%13代表点数
            System.out.print(doss(0, 51) + " ");
        System.out.println();
        int[] m=luckyMoney(5,100);//模拟发红包1元钱发5个红包（实际单位都是分)
        System.out.println(Arrays.toString(m));
    }
}
