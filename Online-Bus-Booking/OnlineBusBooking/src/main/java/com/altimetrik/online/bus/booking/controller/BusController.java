package com.altimetrik.online.bus.booking.controller;

import com.altimetrik.online.bus.booking.dto.SearchBusInfoDTO;
import com.altimetrik.online.bus.booking.model.BusDetails;
import com.altimetrik.online.bus.booking.model.City;
import com.altimetrik.online.bus.booking.service.BusDetailsService;
import com.altimetrik.online.bus.booking.service.CityService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/online/bus")
public class BusController {

  private static final Logger logger = LoggerFactory.getLogger(BusController.class);

  CityService cityService;
  BusDetailsService busDetailsService;

  @Autowired
  public void setCityService(CityService cityService) {
    this.cityService = cityService;
  }

  @Autowired
  public void setCityService(BusDetailsService busDetailsService) {
    this.busDetailsService = busDetailsService;
  }

  @GetMapping("get-cities")
  @ResponseBody
  public List<City> getCities() {
    logger.info("getCities() :: Starts");

    List<City> cityList = cityService.getCities();
    logger.debug("getCities() :: City List :: {} ", cityList);

    logger.info("getCities() :: Ends");
    return cityList;
  }

  @GetMapping("get-bus-details")
  @ResponseBody
  public List<BusDetails> getBusDetails() {
    logger.info("getBusDetails() :: Starts");

    List<BusDetails> busDetails = busDetailsService.getBusDetails();
    logger.debug("Bus Detail List :: {} ", busDetails);

    logger.info("getBusDetails() :: Ends");
    return busDetails;
  }

  @PostMapping("search-bus/{sourceCity}/{destinationCity}/{travelDate}/{returnDate}")
  @ResponseBody
  public SearchBusInfoDTO searchBusDetails(
      @PathVariable("sourceCity") Integer sourceCity,
      @PathVariable("destinationCity") Integer destinationCity,
      @PathVariable("travelDate") String travelDate,
      @PathVariable("returnDate") String returnDate) {
    logger.info("searchBusDetails() :: Starts");
    SearchBusInfoDTO searchBusInfoDTO = new SearchBusInfoDTO();

    logger.debug(
        "searchBusDetails() :: Request Parameters :: sourceCity-{},destinationCity-{},travelDate-{},returnDate-{} ",
        sourceCity,
        destinationCity,
        travelDate,
        returnDate);

    if (null != sourceCity && null != destinationCity && null != travelDate) {
      searchBusInfoDTO =
          busDetailsService.searchBusDetails(sourceCity, destinationCity, travelDate, returnDate);
      logger.debug("Search Bus Detail in List :: {} ", searchBusInfoDTO);
    } else {
      searchBusInfoDTO.setStatus("Failed");
    }

    logger.info("searchBusDetails() :: Ends");
    return searchBusInfoDTO;
  }

  @PutMapping("update-booking")
  @ResponseBody
  public String updateBooking() {
    return "updateBooking";
  }
}
