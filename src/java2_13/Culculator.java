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
	void add(double decimalAdd1,double decimalAdd2) {
		double answerAdd = decimalAdd1 + decimalAdd2;
		System.out.println(answerAdd);
	}
	void sub(double decimalSub1,double decimalSub2) {
		double answerSub = decimalSub1 - decimalSub2;
		System.out.println(answerSub);
	}
	void mul(double decimalMul1,double decimalMul2) {
		double answerMul = decimalMul1 * decimalMul2;
		System.out.println(answerMul);
	}
	void div(double decimalDiv1,double decimalDiv2) {
		double answerDiv = decimalDiv1 / decimalDiv2;
		System.out.println(answerDiv);
	}
}
