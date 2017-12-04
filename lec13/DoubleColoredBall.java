import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class DoubleColoredBall {
	public static void main(String[] args) {
		Vector<Integer> balls = new Vector<Integer>();
		for (int i = 1; i <= 15; i++)
			balls.add(i);
		System.out.println(balls);
		Collections.shuffle(balls);
		System.out.println(balls);
		List<Integer> firstPrize = balls.subList(0, 7);
		System.out.println(firstPrize);
		for (int i = 0; i < 10; i++) {
			Collections.shuffle(balls);
			// System.out.println(balls);
			List<Integer> users = balls.subList(0, 7);
			System.out.println(users);
		}
	}
}
