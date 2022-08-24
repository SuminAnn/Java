package collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

import collection.Member;

public class MemberTreeSet {

private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
		//treeSet = new TreeSet<Member>(new Member()); Comparator를 사용하는 경우에는 생성자에 default 생성자를 호출해줘야한다
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			int tempID = member.getMemberID();
			if(memberID == tempID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAll() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		
		System.out.println(treeSet);
	}
}
