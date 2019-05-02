package new_work_better;

import java.util.Scanner;
import java.util.Random;

public class New {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		//랜덤과 스캔 사용준비
		
		int how_long, number;
		System.out.println("배열의 크기를 입력해주세요.");
		how_long = scan.nextInt();
		//배열 크기 입력
		int[][] arr1 = new int[how_long][how_long];
		//입력한 크기의 배열 생성	
		
		
	
		
				
				
				
		
		// 배열 요소 출력
		for (int i = 0; i < how_long; i++) {
			System.out.println(); // 아래 for이 끝나면 줄바꾸려고 넣음
			for (int j = 0; j < how_long; j++) {
				System.out.print(arr1[i][j] + " ");// 여기가 진짜 배열 출력
			}
		}
		// http://mwultong.blogspot.com/2006/11/java-2-array-of-array.html

		
		
	
		
	}// 스태틱꺼
}// 클래스꺼
