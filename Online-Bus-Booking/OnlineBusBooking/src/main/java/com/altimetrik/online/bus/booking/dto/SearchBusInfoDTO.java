package com.altimetrik.online.bus.booking.dto;

import com.altimetrik.online.bus.booking.bo.SearchBusInfoBO;
import java.util.List;
import lombok.Data;

@Data
public class SearchBusInfoDTO {

  String status = "Success";

  Integer totalNoOfResults;

  List<SearchBusInfoBO> searchBusInfoList;
}
