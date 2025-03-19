package day15;

public class ExStudent implements Comparable<ExStudent> {
	// 멤버 변수 초기화 
	private String name;
	private int score;
	
	// 기본 생성자 (1) 
	public ExStudent() {}
	
	// 기본 생성자 (2)
	public ExStudent(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// 메서드
	
	// toString()
	@Override
	public String toString() {
		return "ExStudent [name=" + name + ", score=" + score + "]";
	}
	
	// compareTo
		// compare 는 o1 과 o2 를 비교하여 정렬한 반면 
		// compareTo 는 this.자기자신.compareTO(자기자신 다음 객체)
	@Override
	public int compareTo(ExStudent o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
	
	// Getter(), Setter()
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
