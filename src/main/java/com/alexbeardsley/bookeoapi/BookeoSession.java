package com.alexbeardsley.bookeoapi;

import com.bookeo.api.request.ApiClient;
import com.bookeo.api.service.AvailabilityApi;
import com.bookeo.api.service.BookingsApi;
import com.bookeo.api.service.CustomersApi;
import com.bookeo.api.service.HoldsApi;
import com.bookeo.api.service.PaymentsApi;
import com.bookeo.api.service.ResourceBlocksApi;
import com.bookeo.api.service.SeatBlocksApi;
import com.bookeo.api.service.SettingsApi;
import com.bookeo.api.service.SubaccountsApi;
import com.bookeo.api.service.WebhooksApi;

public class BookeoSession {
	protected ApiClient client;
	protected BookingsApi bookingsApi = null;
	protected AvailabilityApi availabilityApi = null;
	protected CustomersApi customersApi = null;
	protected HoldsApi holdsApi = null;
	protected PaymentsApi paymentsApi = null;
	protected ResourceBlocksApi resourceBlocksApi = null;
	protected SeatBlocksApi seatBlocksApi = null;
	protected SettingsApi settingsApi = null;
	protected SubaccountsApi subAccountsApi = null;
	protected WebhooksApi webHooksApi = null;
	
	public BookeoSession(ApiClient client) {
		this.client = client;
		bookingsApi = new BookingsApi(client);
		availabilityApi = new AvailabilityApi(client);
		customersApi = new CustomersApi(client);
		holdsApi = new HoldsApi(client);
		paymentsApi = new PaymentsApi(client);
		resourceBlocksApi = new ResourceBlocksApi(client);
		seatBlocksApi = new SeatBlocksApi(client);
		settingsApi = new SettingsApi(client);
		subAccountsApi = new SubaccountsApi(client);
		webHooksApi = new WebhooksApi(client);
	}
	
	public BookingsApi bookings() {
		return bookingsApi;
	}
	public AvailabilityApi availability() {
		return availabilityApi;
	}
	public CustomersApi customers() {
		return customersApi;
	}
	public HoldsApi holds() {
		return holdsApi;
	}
	public PaymentsApi payments() {
		return paymentsApi;
	}
	public ResourceBlocksApi resourceBlocks() {
		return resourceBlocksApi;
	}
	public SeatBlocksApi seatBlocks() {
		return seatBlocksApi;
	}
	public SettingsApi settings() {
		return settingsApi;
	}
	public SubaccountsApi subAccounts() {
		return subAccountsApi;
	}
	public WebhooksApi webhooksApi() {
		return webHooksApi;
	}
}
