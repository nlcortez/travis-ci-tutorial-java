package io.github.joaomlneto.travis_ci_tutorial_java;

public class SimpleCalculatorDriver {

	public static void main(String[] args) {
		SimpleCalculator calc = new SimpleCalculator();
		int num = 10;

		num = calc.mul(num, 3);
		num = calc.mul(num, 7);
		num = calc.mul(num, 13);
		num = calc.mul(num, 37);
		
		System.out.println("result: " + num);
	}

}
