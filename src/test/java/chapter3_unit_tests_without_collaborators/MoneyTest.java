package chapter3_unit_tests_without_collaborators;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoneyTest {

	@Test
	public void testMoney_passCurrencyUsd_shouldSetCurrencyUSD() {
		Money money = new Money(10, "USD");
		assertEquals("USD", money.getCurrency());
	}
	
	@Test
	public void testMoney_passAmount10_shouldSetAmount10() {
		Money money = new Money(10, "USD");
		assertEquals(10, money.getAmount());
	}

}
