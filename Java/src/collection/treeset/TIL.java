package collection.treeset;

public class TIL {

	/*
	 TreeSet
	  - 객체의 정렬에 사용되는 클래스
	  - 중복을 허용하지 않으면서 오름차순이나 내림차순으로 객체를 정렬한다
	  - 내부적으로 이진 검색(binary search tree)로 구현되어 있다
	  - 이진 검색 트리에 자료가 저장 될 때 비교하여 저장될 위치를 정한다
	  - 객체 비교를 위해 Comparable이나 Comparator 인터페이스를 구현 해야한다. (주로 Comparable을 사용한다)
	  
	  Comparable 인터페이스와 Comparator 인터페이스
	   - 정렬 대상이 되는 클래스가 구현해야 하는 인터페이스
	   - Comparable은 compareTo()메서드를 구현, 매개 변수와 객체 자신(this)를 비교한다
	   - Comparator는 compare()메서드를 구현, 두개의 매개 변수를 비교한다
	     TreeSet 생성자에 Comparator가 구현된 객체를 매개변수로 전달한다
	   - 일반적으로 Comparable을 더 많이 사용한다
	   - 이미 Comparable이 구현된 경우 Comparator를 이용하여 다른 정렬 방식을 정의 할 수 있다
	 */
}
