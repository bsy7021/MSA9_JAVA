package Day03;

import java.util.Scanner;

public class Ex13_gugu {
	public static void main(String[] args) {
		//구구단()1~9단
		//원하는 단을 입력받아 아래와 같이, 구구단 수식을 출력하시오.
		//입력 : 4
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for (int b = 1; b <= 9; b++) {
			System.out.println(a+"*"+b+"="+a*b);
		}
		sc.close();
	}
}
