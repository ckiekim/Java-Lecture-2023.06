package ch04;

import java.util.Scanner;

public class Ex05_Grade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		scan.close();
		
		String grade, aux;
		if (score % 10 >= 7)
			aux = "+";
		else if (score % 10 >= 4)
			aux = "0";
		else
			aux = "-";
		
		switch(score / 10) {
		case 10:
			grade = "A+"; break;
		case 9:
			grade = "A" + aux; break;
		case 8:
			grade = "B" + aux; break;
		case 7:
			grade = "C" + aux; break;
		case 6:
			grade = "D" + aux; break;
		default:
			grade = "F";
		}
		System.out.printf("점수: %d, 학점: %s\n", score, grade);
	}

}
