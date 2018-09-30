package org.store.impls;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testGetBilling() {
		String result = new Example().getBilling("Lucas");
		assertEquals(result, "Lucas, your total billing is USD 70");
	}

}
