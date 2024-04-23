import java.rmi.server.Operation;

public class Exam10 {
	public static void main(String[] args) {
		// 1 익명 클래스로 사용
		Calculate calculateAdd = new Calculate() {

			@Override
			public int operation(int a, int b) {
				return a + b;
			}
		};
		System.out.println(calculateAdd.operation(10, 20));
		System.out.println("----------------------");
		
		// 2 람다 표현식으로 전환 1
		Calculate calculateAdd1 = (int a, int b) -> {return a + b;};
		System.out.println(calculateAdd1.operation(20, 30));
		System.out.println("----------------------");

		// 2 람다 표현식으로 전환 2		
		Calculate calculateAdd2 = (int a, int b) -> a + b;
		System.out.println(calculateAdd1.operation(20, 30));
		System.out.println("----------------------");
		
		// 2 람다 표현식으로 전환 3
		Calculate calculateAdd3 = ( a,  b) -> a + b;
		System.out.println(calculateAdd1.operation(20, 30));
		System.out.println("----------------------");

		// 2 람다 표현식으로 전환 4
		System.out.println(((Calculate)(a,b) -> a+b).operation(20,30));
	}
}
