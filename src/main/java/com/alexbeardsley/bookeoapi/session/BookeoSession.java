package com.alexbeardsley.bookeoapi.session;

import generated.com.bookeo.api.request.ApiClient;
import generated.com.bookeo.api.service.AvailabilityApi;
import generated.com.bookeo.api.service.BookingsApi;
import generated.com.bookeo.api.service.CustomersApi;
import generated.com.bookeo.api.service.HoldsApi;
import generated.com.bookeo.api.service.PaymentsApi;
import generated.com.bookeo.api.service.ResourceBlocksApi;
import generated.com.bookeo.api.service.SeatBlocksApi;
import generated.com.bookeo.api.service.SettingsApi;
import generated.com.bookeo.api.service.SubaccountsApi;
import generated.com.bookeo.api.service.WebhooksApi;

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

//	protected void addAuthenticationData(Invocation.Builder builder) {
//		builder.header("secretKey", this.secretKey);
//		builder.header("apiKey", this.apiKey);
//	}
//	
//	public List<GetSeatBlockResponse> getSeatBlocks() {
//		WebTarget target = this.client.target(this.baseUrl).path("seatblocks");
//		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
//		addAuthenticationData(builder);
//		return builder.get(List.class);
//	}
//	
//	public List<GetSeatBlockResponse> getSeatBlocks() {
//		WebTarget target = this.client.target(this.baseUrl).path("seatblocks");
//		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON_TYPE);
//		addAuthenticationData(builder);
//		return builder.get(List.class);
//	}

//	protected WebTarget getNewWebTargetBuilder() {
//		WebTarget webTarget = this.client.target(this.baseUrl);
//		Invocation.Builder invocationBuilder = webTarget
//				.request(MediaType.APPLICATION_JSON_TYPE);
//		addAuthenticationData(invocationBuilder);
//		return webTarget;
//	}

	/*
	 * WebTarget resourceWebTarget = webTarget.path("resource"); WebTarget
	 * helloworldWebTarget = resourceWebTarget.path("helloworld"); WebTarget
	 * helloworldWebTargetWithQueryParam =
	 * helloworldWebTarget.queryParam("greeting", "Hi World!");
	 * 
	 * Invocation.Builder invocationBuilder =
	 * helloworldWebTargetWithQueryParam.request(MediaType.TEXT_PLAIN_TYPE);
	 * invocationBuilder.header("some-header", "true");
	 * invocationBuilder.header("secretKey", secretKey);
	 * invocationBuilder.header("apiKey", apiKey); Response response =
	 * invocationBuilder.get(); System.out.println(response.getStatus());
	 * System.out.println(response.readEntity(String.class));
	 */
}
