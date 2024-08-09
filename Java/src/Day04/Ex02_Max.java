package Day04;

import java.util.Scanner;

public class Ex02_Max {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		//Integer.MIN_VALUE : = -21억xxx : int의 최솟값
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		sc.close();
	}
}
