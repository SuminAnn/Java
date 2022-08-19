package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList memberArryList = new MemberArrayList();
		
		Member memberLee = new Member(101, "�̼���");
		Member memberKim = new Member(102, "������");
		Member memberShin = new Member(103, "�Ż��Ӵ�");
		
		memberArryList.addMember(memberLee);
		memberArryList.addMember(memberKim);
		memberArryList.addMember(memberShin);
		
		memberArryList.showAll();
		
		memberArryList.removeMember(memberKim.getMemberID());
		memberArryList.iterator(memberKim.getMemberID());
		memberArryList.showAll();
	}
}
