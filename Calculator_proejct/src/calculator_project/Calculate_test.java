package calculator_project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calculate_test {

	@Test
	void testCalculate() {
		Calculate testCalc = new Calculate();
		
		double result;
		
		result = testCalc.summ(45, 46);
		//assertEquals(90, result);				/*��� ��������� � ����� ����� �������� ���� ������������� ��������*/
		assertEquals(91, result);	
		

		result = testCalc.mult(5, 5);
		assertEquals(25, result);	
		
		
		result = testCalc.subtraction(5, 5);
		assertEquals(0, result);	
		
		result = testCalc.subtraction(5, 0);
		assertEquals(ArithmeticException, result);	
		
		
	}

}
