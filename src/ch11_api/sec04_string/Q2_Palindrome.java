package ch11_api.sec04_string;

/**
 * 3자리 숫자 두개를 곱해서 만든 숫자중 가장 큰 대칭수(팔린드롬)와 그때의 두 수는?
 */
public class Q2_Palindrome {

	public static void main(String[] args) {
		int maxPal = 0, x = 0, y = 0;
		for (int i = 100; i <= 999; i++) {
			for (int k = i; k <= 999; k++) {
				String mul = String.valueOf(i * k);
				if (Strings.isPalindrome(mul)) {
					if (i * k > maxPal) {
						maxPal = i * k;
						x = i;
						y = k;
					}
				}
			}
		}
		System.out.printf("%d x %d = %d\n", x, y, maxPal);
	}

}
