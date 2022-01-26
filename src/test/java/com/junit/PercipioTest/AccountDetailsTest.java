package com.junit.PercipioTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AccountDetailsTest {
	
	AccountDetails ac=new AccountDetails("Rony", 236565d, 123558, 12500d, "savings");
	
	@Test
	public void valdateName()
	{
	assertTrue(ac.getName().matches("^[a-zA-Z]*$"));	
	}
	
	@Test
	public void validateBalc()
	{
		assertTrue(ac.getAcc_bal()>0);
	}

}
