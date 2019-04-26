package com.operr.location;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String>{
	
	public Location findBylocationName(String locationName);
	public void deleteBylocationName(String locationName);
}
