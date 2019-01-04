package chapter3_unit_tests_without_collaborators;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class MoneyTestParametrized {
	
	private static final Object[] getMoney() {
		return new Object[] {
				//method that puts all passed values into an Object[]
				$(10, "USD"),
				new Object[] {20, "EUR"}
		};
	}

	@Test
	@Parameters(method = "getMoney")
	public void test(int amount, String currency) {
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}

}
