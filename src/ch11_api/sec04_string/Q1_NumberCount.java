package ch11_api.sec04_string;

/**
 * 1에서 1000까지 숫자를 썼을 때, 0에서 9까지 숫자는 각각 몇번씩 사용되는가?
 */
public class Q1_NumberCount {

	public static void main(String[] args) {
		String numStr = "";
		for (int i = 1; i <= 1000; i++)
			numStr += i;
		for (int i = 0; i <= 9; i++) {
			int count = Strings.count(numStr, ""+i);
			System.out.println(i + " : " + count);
		}
	}

}
