package ch13_collection.sec01_list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * List Sort
 * 	 1) 대소관계가 명확한 클래스(Integer, String 등)
 *   2) 일반적인 클래스
 */
public class Ex05_Sort {

	public static void main(String[] args) {
		List<Integer> scoreList = Arrays.asList(78, 98, 64, 85, 91);
		// 오름차순 정렬
		scoreList.sort(Comparator.naturalOrder());
		scoreList.forEach(x -> System.out.print(x + " "));
		System.out.println();
		// 내림차순 정렬
		scoreList.sort(Comparator.reverseOrder());
		scoreList.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		List<String> fruitList = Arrays.asList("감", "참외", "수박", "복숭아");
		// 오름차순 정렬
		fruitList.sort(Comparator.naturalOrder());
		fruitList.forEach(x -> System.out.print(x + " "));
		System.out.println();
		// 내림차순 정렬
		fruitList.sort(Comparator.reverseOrder());
		fruitList.forEach(x -> System.out.print(x + " "));
		System.out.println();
	}

}
