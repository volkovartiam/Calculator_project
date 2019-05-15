package calculator_project;

public class Calculate_runner {
		
	static double z = 10;
	static double a = 20;
	static double answer;
	
	
	public static void main(String[] args) {

		Calculate calc = new Calculate();
		
		answer = calc.summ(z,a);
		

		System.out.println("Ваш ответ: ");
		System.out.println(answer);
	}

}
