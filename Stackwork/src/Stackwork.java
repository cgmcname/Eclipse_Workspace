import java.io.*;
import java.util.*;

public class Stackwork {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int max = Integer.MIN_VALUE;

		int hold = 0;

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();

		while (n > 0) {
			int choice = sc.nextInt();
			if (choice == 1) {
				int val = sc.nextInt();
				// max = Math.max(val, max);

				stack.add(val);
			} else if (choice == 2) {

				stack.pop();

			} else if (choice == 3) {
				temp = stack;

				while (!temp.empty()) {
					max = Math.max(temp.pop(), max);
				}

				System.out.println(max);
			}

			n--;
		}
		sc.close();

	}

}
