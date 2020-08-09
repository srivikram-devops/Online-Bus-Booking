package com.altimetrik.online.bus.booking.service;

import com.altimetrik.online.bus.booking.dao.CityRepository;
import com.altimetrik.online.bus.booking.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class CityService {

    private CityRepository cityRepository;

    @Autowired
    public void setCityRepository(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    @Transactional
    public List<City> getCities()
    {
        return (List<City>) cityRepository.findAll();
    }

}
