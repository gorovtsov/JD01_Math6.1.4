//6.1.4.33
package hw.gorovtsov.mathtesting.tasks;

import java.util.Scanner;

public class ThirtyThree {

	public static void main(String[] args) {
		double[] x = new double[5];
		double[] y = new double[5];
		
		//инициализация координат вершин треугольника
		x[1] = 0;
		x[2] = 0;
		x[3] = 6;

		y[1] = 0;
		y[2] = 6;
		y[3] = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите координаты проверяемой точки");
		x[0] = sc.nextInt();
		y[0] = sc.nextInt();

		sc.close();

		/*
		 * Проверяем, по какую сторону от грани полуплоскости находится точка
		 * (проверка треугольника
		 */
		double a = (x[1] - x[0]) * (y[2] - y[1]) - (x[2] - x[1]) * (y[1] - y[0]);
		double b = (x[2] - x[0]) * (y[3] - y[2]) - (x[3] - x[2]) * (y[2] - y[0]);
		double c = (x[3] - x[0]) * (y[1] - y[3]) - (x[1] - x[3]) * (y[3] - y[0]);
		
		double fromCentre = Math.sqrt(Math.pow(x[4] - x[0], 2) + Math.pow(y[4] - y[0], 2));

		if ((a >= 0 && b >= 0 && c >= 0) || (a <= 0 && b <= 0 && c <= 0)) {
			System.out.println("Принадлежит треугольнику");
		} else if(fromCentre <= 3) {
			System.out.println("Принадлежит кругу");
		} else {
			System.out.println("Точка не входит ни в кргу,  ни в треугольник");
		}

	}

}
