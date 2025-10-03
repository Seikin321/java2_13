package java2_13;
import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {

		Culculator calc = new Culculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("実行する計算を選んでください");
		System.out.println("1平方数");
		System.out.println("2階乗");
		System.out.println("3終了");
		int input = scanner.nextInt();
		
		if(input == 1) {
		System.out.println("数字を一つ入力してください");
		double argument = scanner.nextDouble();
		calc.squareNumber(argument);
		}
		if(input == 2) {
			System.out.println("数字を一つ入力してください");
			int num = scanner.nextInt();
			calc.factorial(num);
		}
		if(input ==3) {
			System.out.println("プログラムを終了します");
			scanner.close();
			return;
		}
		scanner.close();
	}

}
