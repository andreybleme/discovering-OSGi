package org.store.command;

import org.apache.felix.service.command.CommandProcessor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.store.api.Billing;

@Component(property = {CommandProcessor.COMMAND_SCOPE + ":String=store", CommandProcessor.COMMAND_FUNCTION + ":String=bill"})
public class BillingCommand {
	
	private Billing billingService;
	
	@Reference
	public void setBilling(Billing billingService) {
		this.billingService = billingService;
	}

	public void bill(String username) {
		System.out.println(billingService.bill(username));
	}

}
