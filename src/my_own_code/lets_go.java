package my_own_code;

import java.util.Scanner;
import java.util.Random;

public class lets_go {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int how_long;

		System.out.println("�迭�� ũ�⸦ �Է����ּ���.");
		
		how_long = scan.nextInt();

		int[][] arr1 = new int[how_long][how_long];

		int fact = 0;
		int cheak = 0;

		Loop1: for (int down = 0; down < how_long; down++) {

			cheak = 0;

			Loop2: for (int side = 0; side < how_long; side++) {

				fact = 0;

				arr1[down][side] = random.nextInt(how_long) + 1;

				if (side != 0) {
					for (int side_cheak = 0; side_cheak < side; side_cheak++) {
						if (arr1[down][side] == arr1[down][side_cheak]) {
							side--;
							fact = 1;
							cheak++;
							if (cheak == 500) {
								down = 0;
								side = 0;
								continue Loop1;
							}
							break;
						} // ������
					} // ����

				} // ���̵� ������

				if (down != 0 && fact == 0) {
					for (int down_cheak = 0; down_cheak < down; down_cheak++) {
						if (arr1[down][side] == arr1[down_cheak][side]) {
							side--;
							cheak++;
							if (cheak == 500) {
								down = 0;
								side = 0;
								continue Loop1;
							}
							break;
						} // if��
					} // for��

				} // ��Ʈ�� �ٿ� ������

			} // side = 0 ����

		} // down = 0 ����

		// �迭 ��� ���
		for (int i = 0; i < how_long; i++) {
			System.out.println(); // �Ʒ� for�� ������ �ٹٲٷ��� ����
			for (int j = 0; j < how_long; j++) {
				System.out.print(arr1[i][j] + " ");// ���Ⱑ ��¥ �迭 ���
			}
		}
		// http://mwultong.blogspot.com/2006/11/java-2-array-of-array.html

	}// ����ƽ��
}// Ŭ������