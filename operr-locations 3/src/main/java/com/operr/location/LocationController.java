package com.operr.location;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LocationController {
	@Autowired
	private LocationRepository locationRepository;
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/location")
	public List<Location> getAllTopics() {
		return locationService.getAllLocation();
	}
	
	@RequestMapping("/location/{name}")
	public Location getLocation(@PathVariable String name) {
		return locationService.getLocation(name);
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/location")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,value = "/location/{name}")
	public void updateLocation(@RequestBody Location location, @PathVariable String name) {
		locationService.updateLocation(location, name);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value = "/location/{name}")
	public void updateLocation(@PathVariable String name) {
		locationService.deleteLocation(name);
		
	}
}
