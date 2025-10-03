package java2_13;

public class Culculator {

	void squareNumber(double decimal) {
		double answer = decimal * decimal;
		System.out.println(answer);
	}
	void factorial(int num ) {
		int answer = 1;
		while(num!=1) {
			answer *= num;
			num--;
		}
			System.out.println(answer);
		
	}
}
