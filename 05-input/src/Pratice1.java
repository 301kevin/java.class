import java.util.Scanner;

public class Pratice1 {
	public static void main(String[] args) {
		// 사용준비
		Scanner sc = new Scanner(System.in);
		
		// 선언 + 입력
		System.out.println("정수입력 :");
		int a = sc.nextInt();
		
		System.out.println("실수입력 :");
		double b = sc.nextDouble();
		
		System.out.println("문자입력 :");
		char c = sc.next().charAt(0);
		
		System.out.println("boolean입력 :");
		boolean d = sc.nextBoolean();
		
		System.out.println("문자열입력 :");
		String e = sc.next();
		
		System.out.println();
		
		System.out.println("정수 : " + a);
		System.out.println("실수 : " + b);
		System.out.println("문자 : " + c);
		System.out.println("boolean : " + d);
		System.out.println("문자열 : " + e);
		
		sc.close();
	}
}
