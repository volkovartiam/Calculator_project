package calculator_project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calculate_test {

	@Test
	void testCalculate() {
		Calculate testCalc = new Calculate();
		
		double result;
		
		result = testCalc.summ(45, 46);
		//assertEquals(90, result);				/*при проверках в тесте нужно задавать один первоначально неверный*/
		assertEquals(91, result);	
		

		result = testCalc.mult(5, 5);
		assertEquals(25, result);	
		
		
		result = testCalc.subtraction(5, 5);
		assertEquals(0, result);	
		
		result = testCalc.div(5, 1);
		assertEquals(5, result);	
		
		result = 5;
		double test = testCalc.getResult();
		assertEquals(test, result);		
	}

}
