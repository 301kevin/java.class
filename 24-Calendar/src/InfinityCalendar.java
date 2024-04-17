import java.util.Calendar;
import java.util.Scanner;

public class InfinityCalendar {
	Scanner sc = new Scanner(System.in);
	Calendar calendar = Calendar.getInstance();
	int y, m;
	int dayNum;

	// 년과 월을 입력
	void input() {
		do {
			System.out.print("년도? ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월? ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);
	}

	// 날짜 설정 및 요일수 구하기
	void setDate() {
		calendar.set(y, m - 1, 1); // 입력받은 년월과 1일로 설정
		// 요일수 저장
		dayNum = calendar.get(Calendar.DAY_OF_WEEK);
	}

	// 요일명 출력
	void outputTitle() {
		System.out.println();
		System.out.printf("%2s %2s%2s%2s %2s%2s%2s\n", "일", "월", "화", "수", "목", "금", "토");
		System.out.println("-------------------------");
	}

	// 날짜 출력
	// 달력을 출력할 때의 2가지 데이터
	// 1 그 달 1일의 요일 2 그 달 총일수
	void output() {
		// 그 달의 총일수 저장
		int datsOfMonth = calendar.getActualMaximum(Calendar.DATE);
		// 요일수만큼 커서 옮기기
		for (int i = 0; i < dayNum; i++) {
			System.out.printf("%2s ", " ");
		}
		// 날짜 출력
		for (int i = 0; i <= datsOfMonth; i++) {
			System.out.printf("%2d ", i);
			dayNum++; // 요일수는 그달의 1일부터 시작함
			// 요일수 값이 일요일(=1)이면 1줄 넘김
			if (dayNum % 7 == 1) {
				System.out.println();
			}
		}
	}
}
