package Day03;

import java.util.Scanner;

public class Ex04_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정보처리기사 합격 기준
		//(조건) 4학년, 60점 이상
		
		System.out.print("학년 : ");
		int year = sc.nextInt();
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		//중첩if문 권장하지 않습니다.
		/*
		//4학년
		if(year==4) {
			//60점이상
			if(score>=60) {
				System.out.println("합격!");
			}
			else {
				System.out.println("불합격..");
			}
		} else {
			System.out.println("응시자격이 없습니다.");
		}
		*/
		//방법1
		if(year==4 && score>=60) {
			System.out.println("합격!");
		}
		else if(year==4){
			System.out.println("불합격..");
		}
		else {
			System.out.println("응시자격이 없습니다.");
		}
		//방법2
		if(year!=4) {//!= : 같지않다.
			System.out.println("응시자격이 없습니다.");
		}
		else if(score>=60) {
			System.out.println("합격!");
		}
		else
			System.out.println("불합격!");
		sc.close();
	}
}
