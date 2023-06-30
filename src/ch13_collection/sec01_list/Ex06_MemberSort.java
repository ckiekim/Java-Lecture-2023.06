package ch13_collection.sec01_list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * List Sort
 * 	 1) 대소관계가 명확한 클래스(Integer, String 등)
 *   2) 일반적인 클래스
 */
public class Ex06_MemberSort {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member(23, "James"));
		list.add(new Member(28, "Maria"));
		list.add(new Member(28, "Brian"));
		list.add(new Member(23, "Emma"));
		// 미리 정의된 순서: 나이 내림차순, 이름 오름차순
		list.sort(Comparator.naturalOrder());
		list.forEach(x -> System.out.println(x));
		System.out.println();
		// 미리 정의된 순서의 역순
		list.sort(Comparator.reverseOrder());
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
		// Comparator class를 만들어서 비교
		list.sort(new MemberComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
		// MemberAgeComparator class를 만들어서 비교
		list.sort(new MemberAgeComparator());
		list.forEach(x -> System.out.println(x));
		System.out.println();
		
		// MemberNameComparator class를 만들어서 비교
		list.sort(new MemberNameComparator());
		list.forEach(x -> System.out.println(x));
	}

}
