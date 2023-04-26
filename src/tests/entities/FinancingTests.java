package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	
	@Test
	public void constructorShouldValidateWhenCorrectData() {
		
		Financing fnn = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, fnn.getTotalAmount());
		Assertions.assertEquals(2000.0, fnn.getIncome());
		Assertions.assertEquals(80, fnn.getMonths());
		
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenIncorrectData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fnn = new Financing(100000.0, 2000.0, 20);
			
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateDataWhenValidateData() {
		double newTotalAmount = 90000.0; //Cada prestação vale 1000, logo o financiamento valerá 90000 e não mais 100000
		Financing fnn = new Financing(100000.0, 2000.0, 80); 
		
		fnn.setTotalAmount(newTotalAmount);

		Assertions.assertEquals(newTotalAmount, fnn.getTotalAmount());
		
		
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenUnvalidateData() {
		
		double newTotalAmount = 110000.0;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fnn = new Financing(100000.0, 2000.0, 80);
			
			fnn.setTotalAmount(newTotalAmount);

		});
	}
	
	@Test
	public void setIncomeShouldUpdateDataWhenValidateData() {
		double newIncome = 2100.0; 
		Financing fnn = new Financing(100000.0, 2000.0, 80); 
		
		fnn.setIncome(newIncome);

		Assertions.assertEquals(newIncome, fnn.getIncome());
		
		
	}
	
	@Test
	public void setIncomeShouldThrowExceptionWhenUnvalidateData() {
		
		double newIncome = 1900.0;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fnn = new Financing(100000.0, 2000.0, 80);
			
			fnn.setIncome(newIncome);

		});
	}


	@Test
	public void setMonthsShouldUpdateDataWhenValidateData() {
		int newMonths = 81;
		Financing fnn = new Financing(100000.0, 2000.0, 80); 
		
		fnn.setMonths(newMonths);

		Assertions.assertEquals(newMonths, fnn.getMonths());
		
		
	}
	
	@Test
	public void setMonthsShouldThrowExceptionWhenValidateData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			
			Financing fnn = new Financing(100000.0, 2000.0, 20);

		});
		
		
	}
	
	@Test
	public void entryShouldCalculateValueCorrecly() {
		double expectedValue = 20000.0;
		Financing fnn = new Financing(100000.0, 2000.0, 80); 
		
		fnn.entry();
		
		Assertions.assertTrue(expectedValue == fnn.entry());
	}
	
	
	
	
}
