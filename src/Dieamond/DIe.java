package Dieamond;

import java.util.Scanner;

public class DIe {

	public static void main(String[] args) {

		int how_big1;

		System.out.println("다이아몬드의 반지름을 입력해주세요");
		Scanner scan = new Scanner(System.in);

		how_big1 = scan.nextInt();

		int how_big2 = how_big1;

		int star = 1;

		for (int a = 0; a < how_big1; a++) {

			for (int i = 0; i < how_big2; i++)
				System.out.print(" ");

			for (int j = 0; j < star; j++)
				System.out.print("*");

			how_big2--;
			star += 2;

			System.out.println(" ");

		}

		for (int a = how_big1 + 1; a > 0; a--) {

			for (int i = how_big2; i > 0; i--)
				System.out.print(" ");

			for (int j = star; j > 0; j--)
				System.out.print("*");

			how_big2++;
			star -= 2;

			System.out.println(" ");

		}

	}

}
