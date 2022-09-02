package stream;

public class TIL {

	/*
	 스트림(stream)
	  - 자료의 대상과 관계없이 동일한 연산을 수행한다
	     배열, 컬렉션은 대상으로 동일한 연산을 수행한다
	     일관성 있는 연산으로 자료의 처리를 쉽고 간단하게 한다
	  - 한번 생성하고 사용한 스트림은 재상용 할수 없다
	     자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모된다
	     다른 연산을 위해서는 새로운 스트림을 생성해야 한다
	  - 스트림 연산은 기존 자료를 변경하지 않는다
	     자료에 대한 스트림을 생성하면 별도의 메모리 공간을 사용하므로 기존 자료를 변경하지 않는다
	  - 스트림 연산은 중간 연산과 최종 연산으로 구분된다
	     스트림에 대해 중간 연산은 여러 개 적용될 수 있지만 최종 연산은 마지막에 한 번만 적용된다
	     최종연산이 호출되어야 중간연산의 결과가 모두 적용된다. 이를 지연 연산이라 한다
	     
	  reduce() 연산
	   - 정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용
	   - 최종 연산으로 스트림의 요소를 소모하여 연산을 수행
	   - 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행
	 */
}
