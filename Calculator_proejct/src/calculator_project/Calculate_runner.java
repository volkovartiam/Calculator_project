package calculator_project;

public class Calculate_runner {
		
	static double z = 10;
	static double a = 0;
	static double answer, answer1;
	
	
	public static void main(String[] args) {

		Calculate calc = new Calculate();
		
		answer = calc.summ(z,a);
		answer = calc.div(z,a);
		
		answer1 = calc.getResult();
		
		System.out.println("Ваш ответ: ");
		System.out.println(answer1);
	}

}
