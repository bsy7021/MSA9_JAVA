package Day03;

import java.util.Scanner;

public class Ex01_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		//입력 받은 값이 홀수인지, 짝수인지 조건문으로 판단하시오.
		//if 조건문
		//*if(조건식){ }
		// 홀수 조건식 : num
		if(num%2==1) {
			System.out.println("홀수입니다.");
		}
		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		
		sc.close();
	}
}
