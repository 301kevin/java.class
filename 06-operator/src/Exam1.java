import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		// 선언
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.print("정수 입력 : ");
		num1 = scanner.nextInt();
		System.out.print("정수 입력 : ");
		num2 = scanner.nextInt();
		
		int r1 = num1 + num2; // 더하기 연산자
		int r2 = num1 - num2; // 뺴기 연산자
		int r3 = num1 * num2; // 곱하기 연산자
		int r4 = num1 / num2; // 나누기 연산자
		int r5 = num1 % num2; // 나머지 연산자
		System.out.println();
		
		System.out.println("더하기 : " + r1);
		System.out.println("빼기 : " + r2);
		System.out.println("곱하기 : " + r3);
		System.out.println("나누기 : " + r4);
		System.out.println("나머지 : " + r5);
		
		scanner.close();
	}
}
