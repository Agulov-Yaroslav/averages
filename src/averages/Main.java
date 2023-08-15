package averages;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] arg) {
		System.out.println("Введите целое неотрицательное число. \n"
				+ "Для вывода среднего арифметического всех введенных чисел введите `0` ");
		System.out.println("Cреднее арифметическое всех введенных чисел: " + average());
		scanner.close();
	}

	public static double average() {
		int sum = 0;
		int quantity = 0;
		boolean loop = true;
		String fail = "Введите целое положительное число. ";
		do {
			try {
				
				int a = scanner.nextInt();
				if (a == 0)
					loop = false;
				else {
					sum += a;
					quantity++;
					System.out.print("Введите следующее число: ");
				}

			} catch (InputMismatchException e) {
				System.out.println(fail);
				scanner.next();
			}

		} while (loop);

		double average = (double)sum / quantity;
		return average;
	}
}
