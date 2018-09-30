package org.store.impls;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testGetBilling() {
		String message = new Example().getBilling("andreybleme");
		assertEquals(message, "andreybleme, your billing account is USD 50,00");
	}

}
