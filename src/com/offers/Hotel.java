package com.offers;

public class Hotel {

	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrgencyInfo hotelUrgencyInfo;
	private HotelUrls hotelUrls;
	
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}
	
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}
	
	public Destination getDestination() {
		return destination;
	}
	
	public void setDestination(Destination destination) {
		this.destination = destination;
	}
	
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}
	
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}
	
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}
	
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}
	
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}
	
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}
	
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}
	
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

}