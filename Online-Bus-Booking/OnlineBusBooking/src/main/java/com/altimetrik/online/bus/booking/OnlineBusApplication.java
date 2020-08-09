package com.altimetrik.online.bus.booking;

import com.altimetrik.online.bus.booking.controller.BusController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.altimetrik.online.bus.booking.*"})
public class OnlineBusApplication {

  private BusController busController;

  public static void main(String[] args) {
    SpringApplication.run(OnlineBusApplication.class, args);
  }

  @Autowired
  public void setBusController(BusController busController) {
    this.busController = busController;
  }
}