package collection.hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(101, "이순신");
		Member memberKim = new Member(102, "김유신");
		Member memberShin = new Member(103, "신사임당");
		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberShin);
		
		memberHashSet.showAll();
		
		Member memberLee2 = new Member(101, "이몽룡"); //id가 중복시 add가 되면 안된다(Member에 equals와 hashcode를 구현해야 check가 가능하다)
		memberHashSet.addMember(memberLee2);
		memberHashSet.showAll();
	}
}
