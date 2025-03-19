package day14;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {
	public static void main(String[] args) {
		// Set 을 이용하여 로또번호 6개 생성 (중복 생성 X) 후 출력 	
    Set<Integer> lottoNumbers1 = new HashSet<>();

    while (lottoNumbers1.size() < 6) {
  		// 1~45 사이의 난수 생성
      int randNo1 = (int)(Math.random()*45) + 1; 
      
      // Set 의 특성으로 중복된 값은 자동으로 제거됨
      lottoNumbers1.add(randNo1); 
    }

    System.out.println("생성된 로또 번호: " + lottoNumbers1);
    
    
		// TreeSet()
    	// TreeSet 을 이용하여 로또번호 6개 생성 (중복 생성 X) 후 출력 	
    Set<Integer> lottoNumbers2 = new HashSet<>();
    
    TreeSet<Integer> treeset = new TreeSet<>();
    
    while (lottoNumbers2.size() < 6) {
  		// 1~45 사이의 난수 생성
      int randNo2 = (int)(Math.random()*45) + 1; 
      
      // Set 의 특성으로 중복된 값은 자동으로 제거됨
      lottoNumbers2.add(randNo2); 
    }
    
    System.out.println("생성된 로또 번호: " + lottoNumbers2);
    System.out.println("-------------Treeset 의 Method() ---------------");
    
    
    	// TreeSet().first() : 가장 앞에 있는 값
    	// TreeSet().last() : 가장 뒤에 있는 값
    	System.out.println(treeset.first());
    	System.out.println(treeset.last());
    
    	// TreeSet().headSet() : 기준값의 앞쪽 값 
    	// TreeSet().tailSet() : 기준값의 뒤쪽 값 
    	System.out.println(treeset.headSet(20));
    	System.out.println(treeset.tailSet(20));
    
    	// TreeSet().subSet(시작, 끝) : 시작 부터 끝까지 범위의 값을 출력 
    		// 시작값은 포함 끝값은 미포함
    
	}
}
