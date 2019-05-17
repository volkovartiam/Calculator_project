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

	/*вычитание*/
	public double subtraction (double x,  double y){
		result = x - y;
		return this.result;
		
	}
	
	/*умножение*/
	public double mult (double x,  double y){
		result = x * y;
		return this.result;
		
	}	
	
	/*деление*/
	public double div (double x,  double y) {
	
		if(y == 0) {
				result = 0;
				//throw new ArithmeticException("Деление на ноль не возможно"); 
				System.out.println("Деление на ноль не возможно");
	      		}
			
		else {	
			result = x / y;
		}	
		return this.result;
	}	
	
	
	/*получить значение результата*/
	public double getResult () {
		return result;
	}

	
		
	

	
	
}
