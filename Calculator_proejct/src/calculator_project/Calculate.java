package calculator_project;

public class Calculate {

	double x;
	double y;
	double result;
	
	/*����� ��� ������������*/
	public double summ (double x,  double y){
		result = x + y;
		return this.result;
		
	}

	/*���������*/
	public double subtraction (double x,  double y){
		result = x - y;
		return this.result;
		
	}
	
	/*���������*/
	public double mult (double x,  double y){
		result = x * y;
		return this.result;
		
	}	
	
	/*�������*/
	public double div (double x,  double y) {
	
		if(y == 0) {
				result = 0;
				//throw new ArithmeticException("������� �� ���� �� ��������"); 
				System.out.println("������� �� ���� �� ��������");
	      		}
			
		else {	
			result = x / y;
		}	
		return this.result;
	}	
	
	
	/*�������� �������� ����������*/
	public double getResult () {
		return result;
	}

	
		
	

	
	
}
