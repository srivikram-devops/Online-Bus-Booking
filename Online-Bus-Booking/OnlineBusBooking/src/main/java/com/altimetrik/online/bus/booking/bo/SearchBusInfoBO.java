package com.altimetrik.online.bus.booking.bo;

import javax.persistence.Id;
import lombok.Data;

@Data
public class SearchBusInfoBO {

  @Id
  Long busId;

  String busNumber;

  String busName;

  String departureCode;

  String arrivalCode;

  String startTime;

  String arrivalTime;

  String duration;

  String busFair;
}
