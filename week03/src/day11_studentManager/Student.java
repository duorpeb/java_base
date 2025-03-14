// Student.c{}, 학생의 정보를 담는 클래스

// 학생 정보 : 학번, 이름, 나이, 전화번호, 주소, 수강과목 (Subject 형 배열)	
// Student.c{} 의 메서드 
// 메서드 1) 학생 정보를 출력하는 메서드
// 메서드 2) 수강 신청을 위한 메서드 
// 메서드 3) 수강 철회를 위한 메서드

package day11_studentManager;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	private String name;
	private int id;
	private int age;
	private String phone;
	private String residence;
	private Subject[] subArr = new Subject[5];
	private int subArrCnt;

	// 기본 생성자 (1)
	public Student() {}

	// 기본 생성자 (2) - 모든 멤버 변수를 받는 생성자
	public Student(String name, int id, int age, String phone, String residence, Subject[] subArr) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.residence = residence;
		this.subArr = subArr;
	}
	
	// 기본 생성자의 오버로딩 (1) - 학생 정보를 받는 생성자 
	public Student(String name, int id, int age, String phone, String residence) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.residence = residence;
	}

	// 기본 생성자의 오버로딩 (2) 
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	// 수강 신청 메서드 (Check)
		// Student 의 Subject 형 배열에 
		// 수강 정보를 추가하기 위한 메서드, enrollSubject() 
	public void enrollCourse(Subject tmpSub) {
		// 추가할 공간이 없을 경우 배열 추가 생성 
		if(subArrCnt == subArr.length) {
			// 기존 배열의 길이 + 5 를 길이로 가진 배열 생성 
			Subject[] tmp = new Subject[subArr.length + 5];
			
			// 배열 복사
			System.arraycopy(subArr, 0, tmp, 0, subArr.length);
			
			// 길이가 늘어난 배열에 데이터 옮기기
			subArr = tmp;
		}
		subArr[subArrCnt] = tmpSub;
		subArrCnt++;
		System.out.println("수강신청이 완료되었습니다");
	}
	
	
	// 수강 신청 철회 메서드 
		// 실제 배열에서 수강 과목을 삭제하는 메서드, dropCourse()
	public void dropCourse(int courseCode) {
			int tmp = -1;
			
			if(courseCode == 0) { return; }
			
			for(int i = 0; i< subArrCnt; i++) {
				if(subArr[i].getCourseCode() == courseCode) {
					tmp = i;
					break;
				}
			}
			
			// 찾는 값이 없는 경우 
			if(tmp == -1) {
				System.out.println("취소할 강의가 존재하지 않습니다.");
				return;
			}
			
			// 삭제
				// tmp 번지부터 뒷번지를 앞으로 옮기는 작업
			for(int i = tmp; i < subArrCnt-1; i++) {
				subArr[i] = subArr[i+1];
			}
			
				// 마지막 끝번지는 null
			subArr[subArrCnt-1] = null;
			subArrCnt--;
			
			System.out.println("수강 취소를 완료했습니다..!");
	}
	
	// toString()
	@Override
	public String toString() {
		return "학번 : " + id + "\t" + "이름 : " + name + "\t" + "나이 : " + age + "연락처 : " + phone 
				+ "\t" + "주소 : " + residence + "\n" + "수강 과목 : " + Arrays.toString(subArr)
				+ "\n";
	}
	

	// Getter & Setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}
	
	public Subject[] getSubArr() {
		return subArr;
	}

	public void setSubArr(Scanner sc) {
		this.subArr = subArr;
	}
}
