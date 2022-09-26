package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pratice {

	private static List<String> list;
	
	public static void main(String[] args) {
		list = Arrays.asList("element1", "element2", "element3","element4", "element5");
		list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		System.out.println();
		
		list = Arrays.asList("tree", "happy", "apple","next", "korea");
		String result = list.stream().map(str -> str.substring(0,1)).map(str -> str.toUpperCase()).collect(Collectors.joining(" "));
		System.out.println(result);
		System.out.println();
		
		list = Arrays.asList("exit", "dive", "bus","cat", "all");
		list.stream().map(str -> str.substring(0,1)).map(str -> str.toUpperCase()).sorted().forEach(System.out::println);
	}
}
