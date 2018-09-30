package org.store.impls;

import org.osgi.service.component.annotations.*;
import org.store.api.Billing;

@Component
public class Example implements Billing {

	@Override
	public String getBilling(String user) {
		String message = user + ", your total billing is USD 70";
		return message;
	}

}
