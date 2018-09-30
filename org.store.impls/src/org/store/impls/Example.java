package org.store.impls;

import org.osgi.service.component.annotations.Component;
import org.store.api.Billing;

@Component
public class Example implements Billing {

	@Override
	public String bill(String username) {
		String message = username + ", your billing account is USD 50,00";
		return message;
	}

}
