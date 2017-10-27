/*
 * 6.1.4.2  
 */
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		int[] x = new int[2];
		int[] y = new int[2];

		Scanner sc = new Scanner(System.in);
		System.out.println("Note: точка 0 - проверяемая точка, точка 1 - точка отсчета");
		
		for (int i = 0; i < 2; ++i) {
			System.out.println("вВведите координаты (x" + i + ",y" + i + "): ");
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		sc.close();

		double a = Math.sqrt(Math.pow(x[1] - x[0], 2) + Math.pow(y[1] - y[0], 2));

		if (a <= 3 && a <= 5 && x[0] >= 0) {
			System.out.println("����� ����������� �����");
		} else {
			System.out.println("����� �� ����������� �����");
		}
	}
}
