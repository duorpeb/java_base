// 학생 관리 프로그램 
// Student.c{}, 학생의 정보를 담는 클래스
	// 학생 정보 : 학번, 이름, 나이, 전화번호, 주소, 수강과목 (Subject 형 배열)

// Subject.c{}, 수강 과목에 대한 정보를 가진 클래스 
	// 수강 과목 : 과목 이름, 과목 코드, 학점, 시수, 교수명, 시간표, 강의실 

// Controller.c{} : Main 의 기능이 있는 클래스
	// 학생 등록 시 기존의 배열에서 1 추가, 학생 수정 시 기존의 배열에서 수정  
	
	// 전체 리스트 출력 시 기존의 배열을 출력 

	// 학생 검색 시 학생 정보와 수강 정보가 뜨도록

	// 수강 철회 시 기존의 학생 배열에서 수강 과목 삭제 


// Main.c{}
	// 기능은 Controller 에서 출력만 Main 에서  
		// 기능 : 학생 등록/수정, 전체 리스트 출력, 학생 검색, 수강 신청/수정, 종료   

// 아래의 순서대로 작성
// Subject.c{} -> Student.c{} -> Controller.c{} ->  Main.c{}
package day11_studentManager;

import java.util.Scanner;

public class ExamMain {
	public static void main(String[] args) {
		Controller c = new Controller();
		
		Scanner sc = new Scanner(System.in);
		
		int menuNum = 0;
		
		// 학생 관리 프로그램을 do-while 반복문으로 반복하여 실행 
		do {
			// 학번 무작위 생성 메서드
				// 학번을 무작위로 생성하고 학생에게 부여 
			c.makeId();
			
			// switch 문 선택을 위해 변수 입력받기 
			menuNum = c.menuPrint(sc);
			
			// 1) 학생등록, 2) 학생리스트출력, 3) 학생 정보 검색, 4) 수강신청, 5) 수강철회, 6)종료
			switch(menuNum) {
				case 1: c.insertStudent(sc); break;
				
				case 2: c.printStudent(); break;
				
				case 3: c.searchStudent(sc); break;
				
				case 4: c.insertSubject(sc); break;
				
				case 5: c.deleteSubject(sc); break;
				
				case 6: 	
					System.out.println("Finished..!"); break;
					
				default : 
					System.out.println("Wrong Input..!");
			}
		}while(menuNum != 6);
		
		sc.close();
	}
}
