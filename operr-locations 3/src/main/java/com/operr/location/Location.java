package com.operr.location;
import javax.persistence.Id;

//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "locations")
public class Location {
	@Id
	private  String id;
	private String lat;
	private String lng;	
	private String locationName;
	
	public Location() {
		
	}
	
	public Location(String id, String lat, String lng, String locationName) {
		super();
		this.id = id;
		this.lat = lat;
		this.lng = lng;
		this.locationName = locationName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	@Override
	public String toString() {
		return String.format("Location name= %s, Longitutde= %s, Latitude= %s, id= %s",locationName, id,lng, lat);
	}
	
}
