package one;

import java.util.Scanner;

public class One_go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, r;

		Scanner scan = new Scanner(System.in);

		System.out.println("���� ũ�⸦ �Է��Ͻÿ�");
		r = scan.nextInt();

		for (x = -r; x <= r; x+=2) {
			for (y = -r; y <= r; y++) {

				if (x * x + y * y <= r * r)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println(" ");
		}

	}

}
