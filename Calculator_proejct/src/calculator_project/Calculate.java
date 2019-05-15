package calculator_project;

public class Calculate {

	double x;
	double y;
	double result;
	
	/*метод для суммирования*/
	public double summ (double x,  double y){
		result = x + y;
		return this.result;
		
	}

	
	public double subtraction (double x,  double y){
		result = x - y;
		return this.result;
		
	}
	

	public double mult (double x,  double y){
		result = x * y;
		return this.result;
		
	}	
	
	
	public double div (double x,  double y) {
	
		if(y == 0) throw new ArithmeticException("Деление на ноль не возможно,"); 
		
			result = x / y;
			return this.result;

		
	}

	
	
}
