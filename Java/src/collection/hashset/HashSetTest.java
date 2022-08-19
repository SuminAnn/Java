package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		boolean a = set.add("AAA");
		set.add("BBB");
		set.add("CCC");
		
		System.out.println(set);
		
		boolean b = set.add("AAA");
		
		System.out.println(set);
		
		System.out.println(a);
		System.out.println(b);
	}
}
