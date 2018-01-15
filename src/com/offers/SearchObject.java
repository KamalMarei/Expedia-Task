package com.offers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;


public class SearchObject {
	
	private String destination;
	private int lengthOfStay;
	private String destinationId;
	
	private List<Hotel> results;

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
	
	public String getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
	
	public List<Hotel> getResults(){
		return results;
	}
	
	public void setResults(List<Hotel> results){
		
		this.results = new ArrayList<Hotel>();
		
		for(Hotel hotel: results){
			
			if((destination.isEmpty() || hotel.getDestination().getShortName().toUpperCase().contains(destination.toUpperCase())) &&
				((String.valueOf(lengthOfStay) == null || lengthOfStay == 0) || hotel.getOfferDateRange().getLengthOfStay() == lengthOfStay)&&
				(destinationId.isEmpty() || hotel.getDestination().getRegionID().equals(destinationId))){
				
				this.results.add(hotel);
			}
			
		}
	}
	
	public void clearSearchFields(){
		this.destination = null;
		this.destinationId = null;
		this.lengthOfStay = 0;
	}
	
	public void setResults(){
		
		try {
			List<com.offers.Hotel> hotelsList = getHotelsFromJSON();
			
			setResults(hotelsList);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private List<com.offers.Hotel> getHotelsFromJSON() throws Exception {
		
		String json;
		json = readUrl("https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel");
		Gson gson = new Gson();        
		Page page = gson.fromJson(json, Page.class);
		
		List<com.offers.Hotel> hotelsList = page.getOffers().getHotel();
		return hotelsList;
	}
	
	private String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder sb = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                sb.append(chars, 0, read); 

            return sb.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }
}
