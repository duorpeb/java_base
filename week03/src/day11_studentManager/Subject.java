// Subject.c{}, 수강 과목에 대한 정보를 가진 클래스 
	// 수강 과목 : 과목 이름, 과목 코드, 학점, 시수, 교수명, 시간표, 강의실 
package day11_studentManager;

import java.util.Scanner;

public class Subject {
	private String course;
	private int courseCode;
	private int credit;
	private int lessonTime;
	private String professorName;
	private String timeTable;
	private String coursePlace;
	
	// 기본 생성자 (1)
	public Subject() {}
	
	// 기본 생성자 (2) - 모든 멤버 변수를 받는 생성자
	// Source -> Generate Constructor Using Fields 로 생성 가능
	public Subject(String course, int courseCode, int credit, int lessonTime
			,String professorName,String timeTable, String coursePlace) {
		
		this.course = course;
		this.courseCode = courseCode;
		this.credit = credit;
		this.lessonTime = lessonTime;
		this.professorName = professorName;
		this.timeTable = timeTable;
		this.coursePlace = coursePlace;
	}

	
	// toString(), 수강 신청 가능 목록의 출력을 위한 메서드 
	@Override
	public String toString() {
		return "강의명 : " + course + "\t 과목 코드 : " + courseCode + "\t 학점 : " + credit 
				+ "\t\t 수업 시수 : " + lessonTime + "\n교수명 : " + professorName + "\t 시간표 : " 
				+ timeTable + "\t 강의실 : " + coursePlace;
	}

	
	
	// Getter & Setter
	public String getCourse() {
		return course;
	}
	


	public void setCourse(String course) {
		this.course = course;
	}
	
	
	public int getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}
	
	
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	
	public int getLessonTime() {
		return lessonTime;
	}
	public void setLessonTime(int lessonTime) {
		this.lessonTime = lessonTime;
	}
	
	
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	
	
	public String getTimeTable() {
		return timeTable;
	}
	public void setTimeTable(String timeTable) {
		this.timeTable = timeTable;
	}
	
	
	public String getCoursePlace() {
		return coursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		this.coursePlace = coursePlace;
	}
}
