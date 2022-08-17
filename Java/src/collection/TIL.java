package collection;

public class TIL {

	/*
	  Array(배열) : 같은 형의 데이터 타입을 메모리에 저장하는 선형적 자료구조, 논리적 구조와 물리적 구조가 동일하다
	   - fixed-length
	   - index연산
	   - input/output O(n) -> 값이 유동적으로 insert, delete되는 경우에는 배열을 사용하지 않는것이 좋다
	   
	  LinkedList : 데이터와 링크로 구성, 논리적인 위치와 물리적인 위치가 다르다
	   - 유동적인 크기
	   - insert, delete가 자주 발생하는 경우에 사용하면 좋다
	   
	  Stack : 선형 자료구조,  (LIFO)
	   - push(), pop()
	   - peek() : pop()은 값을 꺼내면서 제거하는 것이고 peek()은 get()과 비슷하게 스택 맨 위에 원소를 반환한다
	   - ArrayList를 Stack처럼 이용하는 경우에는 add()를 통해 값을 넣고, remove(size()-1)을 통해서 값을 꺼낸다
	   
	  Queue : 대기열 (FIFO) 
	   - ArrayList를 Queue처럼 이용하는 경우에는 add()를 통해 값을 넣고, remove(0)을 통해서 값을 꺼낸다
	   
	  Tree : 계층 자료규조
	   - 자식node의 수가 최대 2개인 경우를 binary Tree
	   - Binary Search Tree : parent node를 중심으로 left child는 작은 값을 가지고 right child는 큰 값을 가진다, 중복을 허용하지 않는다
	   	- 균형된 Tree인 경우 찾는 시간을 줄일 수 있다
	   	- in-order(left -> me -> right) : 오름차순
	   	- 유일한 키 값
	   	- 루트 노드의 키 값 기준
	   	
	  Hashing : 산술 연산을 이용한 검색방식
	   - 평균 시간 복잡도 = 자료가 N개 일때 O(1)
	   
	 */
}
