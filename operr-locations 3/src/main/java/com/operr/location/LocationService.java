package com.operr.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	@Autowired
	private LocationRepository locationsRepositry;

	private List<Location> locations = new ArrayList<>(Arrays.asList(
			new Location("1","2","3","123"),
			new Location("4","5","6","234"),
			new Location("7","8","9","456")));

	public List<Location> getAllLocation(){
		return locationsRepositry.findAll();
	}

	public Location getLocation(String name){

		return locationsRepositry.findBylocationName(name);
	}

	public void addLocation(Location location) {
		locationsRepositry.insert(location);

	}

	public void updateLocation(Location location, String name) {

		Location loc = locationsRepositry.findBylocationName(name);
		loc.setLat(location.getLat());
		loc.setLng(location.getLng());
		loc.setLocationName(location.getLocationName());
		locationsRepositry.save(loc);
	}

	public void deleteLocation(String name) {
		locationsRepositry.deleteBylocationName(name);;

	}
}
