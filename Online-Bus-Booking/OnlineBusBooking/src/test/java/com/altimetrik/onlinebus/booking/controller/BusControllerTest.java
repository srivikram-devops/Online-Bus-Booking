package com.altimetrik.onlinebus.booking.controller;

import com.altimetrik.online.bus.booking.controller.BusController;
import com.altimetrik.online.bus.booking.dto.SearchBusInfoDTO;
import com.altimetrik.online.bus.booking.service.BusDetailsService;
import com.altimetrik.online.bus.booking.service.CityService;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@EnableJpaRepositories(basePackages = {"com.altimetrik.online.bus.booking.*"})
@EntityScan("com.altimetrik.online.bus.booking.model")
@ContextConfiguration(classes = {BusController.class, CityService.class, BusDetailsService.class})
@Sql({"/schema-h2.sql", "/data-h2.sql"})
public class BusControllerTest {

  CityService cityService;
  BusDetailsService busDetailsService;
  private BusController busController;

  @Autowired
  public void setBusController(BusController busController) {
    this.busController = busController;
  }

  @Autowired
  public void setCityService(CityService cityService) {
    this.cityService = cityService;
  }

  @Autowired
  public void setCityService(BusDetailsService busDetailsService) {
    this.busDetailsService = busDetailsService;
  }

  @Test
  public void testGetCitiesNotNull() {
    Assert.assertNotNull(busController.getCities());
  }

  @Test
  public void testGetCitiesIsNotEmpty() {
    Assert.assertTrue((busController.getCities().size()) > 0);
  }

  @Test
  public void testGetCitiesIsEmpty() {
    Assert.assertFalse(busController.getCities().isEmpty());
  }

  @Test
  public void testGetBusDetailsNotNull() {
    Assert.assertNotNull(busController.getBusDetails());
  }

  @Test
  public void testGetBusDetailsIsNotEmpty() {
    Assert.assertTrue(busController.getBusDetails().size() > 0);
  }

  @Test
  public void testGetBusDetailsIsEmpty() {
    Assert.assertFalse(busController.getBusDetails().isEmpty());
  }

  @Test
  public void testSearchBusDetailsNotNull() {
    SearchBusInfoDTO searchBusInfoDTOS = busController.searchBusDetails(3, 4, "13-01-2017 17:09:42", "13-01-2017 17:09:42");
    Assert.assertNotNull(searchBusInfoDTOS);
  }

  @Test
  public void testSearchBusDetailsOnlyTravelDate() {
    SearchBusInfoDTO searchBusInfoDTOS = busController.searchBusDetails(3, 4, "13-01-2017 17:09:42", null);
    Assert.assertNotNull(searchBusInfoDTOS);
  }

  @Test
  public void testSearchBusDetailsNull() {
    Assert.assertEquals("Failed", busController.searchBusDetails(3, 4, null, null).getStatus());
    Assert.assertEquals(
        "Failed", busController.searchBusDetails(3, null, "13-01-2017 17:09:42", null).getStatus());
    Assert.assertEquals(
        "Failed", busController.searchBusDetails(null, 4, "13-01-2017 17:09:42", null).getStatus());
  }
}
