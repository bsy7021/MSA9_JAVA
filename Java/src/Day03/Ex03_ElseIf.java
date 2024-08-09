package Day03;

import java.util.Scanner;

public class Ex03_ElseIf {
	//성적을 입력받아서 성적에 따른 학점 A~F를 출력하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("성적 : ");
		int score = sc.nextInt();
		//char로 이용하여 출력 1번만
		char grade = 'F';
		//90점 이상 A
		//80점 이상 B
		//70점 이상 C
		//60점 이상 D
		//60점 미만 F
		
		//if문만 쓰는 경우
		/*
		if(score>=90 && score<=100) grade = 'A';
		if(score>=80 && score<90) grade = 'B';
		if(score>=70 && score<80) grade = 'C';
		if(score>=60 && score<70) grade = 'D';
		if(score<60 && score>=0) grade = 'F';
		System.out.println(grade);
		*/
		
		//if ~ else
		if(score>=90 && score<=100)
			grade = 'A';
		else if(score>=80)
			grade = 'B';			
		else if(score>=70)
			grade = 'C';
		else if(score>=60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("학점 : " + grade);
		sc.close();
	}
}
