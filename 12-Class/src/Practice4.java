import java.util.Scanner;

class Sub4 {
	int a = 0, b = 0;
	Scanner scanner = new Scanner(System.in);

	void input() {
		System.out.print("정수 입력: ");
		a = scanner.nextInt();
		System.out.print("정수 입력: ");
		b = scanner.nextInt();
	}

	boolean doubleNum() {
		if (a % b == 0)
			return true;
		else
			return false;
	}

	void output() {
		if (doubleNum())
			System.out.println(a + "(은)는 " + b + "의 배수입니다.");
		else
			System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다.");
	}

}

public class Practice4 {
//	static boolean doubleNum(int a, int b) {
//		if (a % b == 0)
//			return true;
//		else
//			return false;
//	}

//	static int input() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력: ");
//		int a = sc.nextInt();
//		return a;
//	}

//	static void output(int a, int b) {
//		if (doubleNum(a, b))
//			System.out.println(a + "(은)는 " + b + "의 배수입니다.");
//		else
//			System.out.println(a + "(은)는 " + b + "의 배수가 아닙니다.");
//	}

	public static void main(String[] args) {
		// 선언
		Sub4 sub4 = new Sub4();
		// 입력
		sub4.input();
		// 출력
		sub4.output();
	}
}
