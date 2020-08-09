package com.altimetrik.online.bus.booking.dao;

import com.altimetrik.online.bus.booking.model.City;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Qualifier("cityRepository")
@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
