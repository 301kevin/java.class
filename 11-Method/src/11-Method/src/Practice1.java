import java.util.Scanner;

public class Practice1 {
	static boolean doubleNum(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}

	static int input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = scanner.nextInt();
		return a;
	}

	static void output(int a, int b) {
		if (doubleNum(a, b))
			System.out.println(a + "(은)는 " + b + "의 배수입니다");
		else
			System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다");
	}

	public static void main(String[] args) {
		// 선언 입력
		int a = input();
		int b = input();
		// 출력
		output(a, b);
	}
}
