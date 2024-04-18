package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
	// singleton 패턴 시작
	private static FileHelper instance;

	public static FileHelper getInstance() {
		if (instance == null)
			instance = new FileHelper();
		return instance;
	}

	// 생성자가 private 이기 때문에 외부에서 new 로 객체 생성을 할 수 없다
	private FileHelper() {
	}
	// singleton 패턴 끝

	/**
	 * 스트림 형태로 파일 출력
	 * 
	 * @param path    : 경로
	 * @param content : 내용
	 * @param encType : 인코딩 타입
	 * @return : true => 저장 성공, false => 저장 실패
	 */
	public boolean write(String path, String content, String encType) {
		boolean result = false; // true : 저장 성공, false : 저장 실패
		// byte[] 배열로 변경
		byte[] buffer = null;
		try {
			buffer = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] 엔코딩 지정 에러");
			return false; // 함수 강제 종료
//			e.printStackTrace();
		}
		// 파일저장
		OutputStream out = null;
		try {
			out = new FileOutputStream(path);
			out.write(buffer); // 파일 출력
			result = true; // 여기까지 코드가 진행되었다면, 저장 성공
			System.out.println("[INFO] 파일 저장됨 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 경로를 찾을 수 없습니다.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] 저장에 실패했습니다");
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] 알 수 없는 에러가 발생했습니다.");
			// e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 스트림 형태의 파일 읽기
	 * 
	 * @param path    : 경로
	 * @param content : 내용
	 * @return : 성공 => String, 실패 => null
	 */
	public String read(String path, String encType) {
		// 읽은 내용이 저장될 byte 배열
		byte[] data = null;
		// byte 배열에 저장된 데이터를 문자열 변경해서 저장할 변수
		String content = null;

		// 파일 읽기
		InputStream in = null;
		try {
			in = new FileInputStream(path); // 파일 열기
			// 문자열 데이터를 저장할 byte 배열 생성
			// in.abailable() : 파일의 크기를 읽어오는 함수
			data = new byte[in.available()];
			// 읽어와서 저장하기
			in.read(data);
			System.out.println("[INFO] 파일 읽기 성공 >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] 저장 결로를 찾을 수 없습니다. >> " + path);
//			e.printStackTrace();
		} catch (IOException e) {
			data = null; // 예외가 발생했기 때문에 초기화 시킴
			System.out.println("[ERROR] 파일 읽기 실패 >> " + path);
			// e.printStackTrace();
		} catch (Exception e) {
			data = null; // 예외가 발생했기 때문에 초기화 시킴
			System.out.println("[ERROR] 알 수 없는 에러 >> " + path);
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// byte 배열에 저장된 데이터를 문자열 변경
		if (data != null) {
			try {
				content = new String(data, encType);
				// System.out.println(content);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] 인코딩 지정 에러");
//				e.printStackTrace();
			}
		}

		return content;
	}

}
