package ch11_api.sec05_wrapper;

public class Ex01_BoxingUnboxing {

	public static void main(String[] args) {
		// Boxing
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = new Integer(200);		// Deprecated
		Integer obj3 = 300;					// 자동 박싱
		
		// Unboxing
		int val1 = obj1.intValue();
		int val2 = obj2;					// 자동 언박싱
		int val3 = obj3;
		
		System.out.printf("%d, %d, %d\n", val1, val2, val3);
		System.out.println(obj1.toString());
		
		System.out.println(val1 == 100);
		System.out.println(obj1.equals(100));
	}

}
