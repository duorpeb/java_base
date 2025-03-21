// Controller.c{} : Main 의 기능이 있는 클래스
	// 기능 : 학생 등록/수정, 전체 리스트 출력, 학생 검색, 수강 신청/수정, 종료  
package day11_studentManager;

import java.util.Scanner;

// Controller 는 학교 입장 
class Controller implements ManagerFunction{
	// stuTmpArr 은 학생의 수, cnt 는 학생의 최대 idx 
	private Student[] stuTmpArr = new Student[10];
	private int[] arr = new int[100];
	int cnt; 
	
	// 학교가 제공하는 강의 목록
	private Subject[] subListArr = new Subject[3];
	
	
	// 수행가능한 작업의 목록을 출력하는 메서드, menuPrint()
		// Main 에 수행할 작업을 목록을 작성해놓으면 
		// 런타임 오류를 체크하면서 코딩할 수 있음 
	public int menuPrint(Scanner sc) {
		System.out.println("\t\t   <작업 목록>");
		System.out.println("1) 학생 등록\t" + "2) 전체 학생 리스트 출력\t" + "3) 학생 정보 검색");
		System.out.println("4) 수강 신청\t" + "5) 수강 신청 취소\t\t" + "6) 종료");
		
		return sc.nextInt();
	}
	
	// 중복되지 않는 학번을 생성하는 메서드, makeId()
	public void makeId() {
		int i = 0, num = 100;
		
		while(i < 100) {
			arr[i] += num;
			num++;
			i++;
		}
	}
	
	// 학생 등록, insertStudent(Scanner sc)
	@Override
	public void insertStudent(Scanner sc) {
		char response;
		String name;
		Student a = new Student();
		
		sc = new Scanner(System.in);
		
		// 학생 등록
		System.out.print("학생을 등록하시겠습니까? (Y/N) ");
		
		response = Character.toUpperCase(sc.next().charAt(0));
		
		if(response == 'Y') {
			int randNum = (int)(Math.random()*99);
			
			// 100~200 중 무작위로 학번 부여 
			do{
				a.setId(arr[randNum]);
			}while(arr[randNum] == 0);
			
			sc.nextLine();
			
			// 이름 입력 
			System.out.println("이름을 입력하세요");
			System.out.print("이름 : ");
			
			a.setName(sc.nextLine());
			
			// 나이 입력
			System.out.println("나이를 입력하세요");
			System.out.print("나이 : ");
			
			a.setAge(sc.nextInt());
			
			sc.nextLine();
			
			// 전화번호 입력
			System.out.println("연락처를 입력하세요");
			System.out.print("연락처 : ");
			
			a.setPhone(sc.nextLine());
			
			// 거주지 입력
			System.out.println("주소를 입력하세요");
			System.out.print("주소 : ");
			
			a.setResidence(sc.nextLine());
			
			stuTmpArr[cnt] = a;
			cnt++;
		} 
			else if(response == 'N') { 
				System.out.println("Finished..!");
				return;
		} 
			else { System.out.println("잘못된 입력입니다..!"); return; }
	} // fin 

	
	// 학생 수정, updateStudent(Scanner sc){}
	 
	
	// 학생 리스트 출력, Main 에서 배열 생성 후 출력 
	@Override
	public void printStudent() {
		System.out.println("\t\t<전체 학생 정보>");
		
		// toString()
		for(int i = 0; i < cnt; i++) {
			System.out.println(stuTmpArr[i]);
			System.out.println();
		}
		System.out.println("------------------");
	}

	
	// 학생 검색
		// 학생 검색 시 학생 정보와 수강 정보가 출력 
	@Override
	public void searchStudent(Scanner sc) {
		String searchName;
		
		System.out.println("학생의 이름을 입력하세요");
		System.out.print("이름 : ");
		
		searchName = sc.next();
		
		for(int i = 0; i < cnt; i++) {
			if(stuTmpArr[i].getName().equals(searchName)) {
				System.out.println(stuTmpArr[i]);
				return; // +
			}
		}
		System.out.println("");
		System.out.println("");
		// 확인, System.out.println("C");
	}
	
	// 수강 신청 가능한 목록 출력 메서드,printCourseList
	public void printCourseList() {
		System.out.println("<수강 신청 가능 목록>");
		for(Subject s : subListArr) {
			System.out.println(s);
			System.out.println("-------------------------------------------"
					+ "------------------------------------------------------------");
		}
	}
	
	// 수강 신청
		// 수강 신청 시 과목코드, 과목명으로 신청
		// 신청된 정보를 Student.c{} 에 담음 
	@Override
	public void insertSubject(Scanner sc) {
		char c;
		
		int tmpCode;
		int tmp = -1; // +
		
		String tmpCourseName;
		
		// 수강신청 UI
		System.out.println("<수강 신청>");
		System.out.println("수강 신청할 학생의 이름을 입력하세요");
		System.out.print("이름 : ");
		
		String s = sc.next();
		
		// 입력한 이름이 있는 인덱스를 변수에 저장 
		for(int i = 0; i < cnt; i++) {
			if(stuTmpArr[i].getName().equals(s)) { tmp = i; break; }		
		}
		
		// 입력한 이름이 배열에 존재하지 않으면 아래 문장 출력
		if(tmp == -1) { System.out.println("해당 학생은 수강 신청 진행이 불가능합니다"); } 
		
		// 입력한 이름이 배열에 존재하는 경우 수강 신청 진행
		else if(tmp != -1) {
			// 수강 신청 가능한 목록 보여주기 
			subjectList();
			printCourseList();
			
			// 수강 신청
			System.out.println("과목명과 과목 코드를 입력하세요");
				// 과목 코드 입력
			System.out.print("과목 코드 : ");
			tmpCode = sc.nextInt();
			
				// 과목명 입력
			System.out.print("과목명 : ");
			tmpCourseName = sc.next();
			 
				// 입력 확인 
			System.out.println(tmpCourseName + "을(를) 수강신청을 하시겠습니까? (Y/N)");
			c = Character.toUpperCase(sc.next().charAt(0));
			
			if(c == 'Y') { 
				for(int k = 0; k < subListArr.length; k++) {
					if(subListArr[k].getCourseCode() == tmpCode) {
						// stuTmpArr[tmp] 에 subListArr 의 Subject[k] 를 
						// 할당하기 위해서는 Subject 형을 매개변수로 받고 
						// 배열에 추가하는 메서드가 필요하고 그게 enrollCourse()
						stuTmpArr[tmp].enrollCourse(subListArr[k]);
					}
				} 
			} // if fin
			
			else if (c == 'N') { System.out.println("Finished..!"); return; }
			
			// 잘못된 입력인 경우, 수강 신청목록 다시 보여주고 다시 진행
			else { System.out.println("잘못된 입력입니다..!"); return; }
		} // else if fin
	} // insertSubject() fin
	
	
	// 수강 신청 취소
		// 수강 신청 취소 시 이름과 과목 코드를 입력받아 삭제
	public void deleteSubject(Scanner sc) {
		char c;
		
		int tmpCode;
		int tmp = -1; // +
		
		String tmpCourseName;
		
		// 수강 신청 취소 UI
		System.out.println("<수강 신청 취소>");
		System.out.println("수강 신청 취소를 진행할 학생의 이름을 입력하세요");
		System.out.print("이름 : ");
		
		String s = sc.next();
		
		// 입력한 이름이 있는 인덱스를 변수에 저장 
		for(int i = 0; i < cnt; i++) {
			if(stuTmpArr[i].getName().equals(s)) { tmp = i; break; }		
		}
		
		// 입력한 이름이 배열에 존재하지 않으면 아래 문장 출력
		if(tmp == -1) { System.out.println("해당 학생은 수강 신청 진행이 불가능합니다"); } 
		
		// 입력한 이름이 배열에 존재하는 경우 수강 신청 취소
		else if(tmp != -1) {
			// 해당 학생이 수강 신청한 목록 보여주기 
			System.out.println("\t\t   <현재 수강 신청한 강의 목록>");
			System.out.println(stuTmpArr[tmp]);
			
			// 수강 신청 취소
			System.out.println("취소할 과목명과 과목 코드를 입력하세요");
				// 과목 코드 입력
			System.out.print("과목 코드 : ");
			tmpCode = sc.nextInt();
			
				// 과목명 입력
			System.out.print("과목명 : ");
			tmpCourseName = sc.next();
			 
				// 입력 확인 
			System.out.println(tmpCourseName + "의 수강 신청을 취소하시겠습니까? (Y/N)");
			c = Character.toUpperCase(sc.next().charAt(0));
			
			if(c == 'Y') { 
				for(int k = 0; k < subListArr.length; k++) {
					if(subListArr[k].getCourseCode() == tmpCode) {
						// stuTmpArr[tmp] 에 subListArr 의 Subject[k] 를 
						// 할당하기 위해서는 Subject 형을 매개변수로 받고 
						// 배열에 추가하는 메서드가 필요하고 그게 enrollCourse()
						stuTmpArr[tmp].dropCourse(tmpCode);
					}
				} 
			} // if fin
			
			else if (c == 'N') { System.out.println("Finished..!"); return; }
			
			// 잘못된 입력인 경우, 수강 신청목록 다시 보여주고 다시 진행
			else { System.out.println("잘못된 입력입니다..!"); return; }
		} // else if fin
	}

	
	// DB
	public void subjectList() {
		subListArr[0] = new Subject("Java",1,3,3,"Park","월,금) 13:30 ~ 15:00","A 강의실");
		subListArr[1] = new Subject("Python",2,4,4,"Son","화,목) 13:30 ~ 15:30","B 강의실");
		subListArr[2] = new Subject("C++",3,3,3,"Lee","금) 13:00 ~ 16:00","C 강의실");
	}
	
	public void subjectListPrint() {
		for(int i = 0; i < 3; i++) { System.out.println(subListArr[i]); }
	}

	@Override
	public void delteSubject(Scanner sc) {
		// TODO Auto-generated method stub
		
	}
}
