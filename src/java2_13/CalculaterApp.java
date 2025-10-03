package java2_13;
import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {

		Culculator calc = new Culculator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("実行する計算を選んでください");
		System.out.println("1足し算");
		System.out.println("2引き算");
		System.out.println("3掛け算");
		System.out.println("4割り算");
		System.out.println("5平方数");
		System.out.println("6階乗");
		System.out.println("7終了");
		int input = scanner.nextInt();
		
		
		
		if(input == 1) {
		System.out.println("1つ目の数字を入力してください");
		double argument1 = scanner.nextDouble();
		System.out.println("2つ目の数字を入力してください");
		double argument2 = scanner.nextDouble();
		calc.add(argument1,argument2);
		}
		if(input == 2) {
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.sub(argument1,argument2);
			}
		if(input == 3) {
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.mul(argument1,argument2);
			}
		if(input == 4) {
			System.out.println("1つ目の数字を入力してください");
			double argument1 = scanner.nextDouble();
			System.out.println("2つ目の数字を入力してください");
			double argument2 = scanner.nextDouble();
			calc.div(argument1,argument2);
			}
		if(input == 5) {
			System.out.println("数字を1つ入力してください");
			double argument = scanner.nextDouble();
			calc.squareNumber(argument);
		}
		if(input == 6) {
			System.out.println("数字を一つ入力してください");
			int num = scanner.nextInt();
			calc.factorial(num);
		}
		if(input ==7) {
			System.out.println("プログラムを終了します");
			scanner.close();
			return;
		
		}else {
		System.out.println("1から7の数字を入力してください");
		scanner.close();
		return;
		
		}
		
	}

}
