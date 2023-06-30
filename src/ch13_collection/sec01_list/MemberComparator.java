package ch13_collection.sec01_list;

import java.util.Comparator;

public class MemberComparator implements Comparator<Member> {

	@Override
	public int compare(Member m1, Member m2) {
		if (m1.getAge() == m2.getAge())
			return m1.getName().compareTo(m2.getName());
		return -(m1.getAge() - m2.getAge());
	}

}
