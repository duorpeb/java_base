// 학생 프로그램의 인터페이스 작성 
// 메서드명 작성 시 기능에 따라 CRUD 로 작성 
package day11_studentManager;

import java.util.Scanner;

public interface ManagerFunction {
	// 학생 등록
	// Scanner 를 여러 곳에서 사용 시 입력 스트림 내의 충돌이 발생할 수 있기에 
	// 매개 변수로 Scanner 를 받음
	public void insertStudent(Scanner sc);
	
	// 학생 리스트 출력
	public void printStudent();
	
	
	// 학생 검색
	public void searchStudent(Scanner sc);
	
	
	// 수강 신청
	public void insertSubject(Scanner sc);
	
	
	// 수강 철회
	public void delteSubject(Scanner sc);


}
