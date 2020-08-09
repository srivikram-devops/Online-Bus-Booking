package com.altimetrik.online.bus.booking.service;

import com.altimetrik.online.bus.booking.bo.SearchBusInfoBO;
import com.altimetrik.online.bus.booking.dao.BusDetailsRepository;
import com.altimetrik.online.bus.booking.dto.SearchBusInfoDTO;
import com.altimetrik.online.bus.booking.model.BusDetails;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class BusDetailsService {

  private static final Logger logger = LoggerFactory.getLogger(BusDetailsService.class);

  private BusDetailsRepository busDetailsRepository;

  @Autowired
  public void setBusDetailsRepository(BusDetailsRepository busDetailsRepository) {
    this.busDetailsRepository = busDetailsRepository;
  }

  @Transactional
  public List<BusDetails> getBusDetails() {
    return (List<BusDetails>) busDetailsRepository.findAll();
  }

  @Transactional
  public SearchBusInfoDTO searchBusDetails(
      Integer sourceCity, Integer destinationCity, String travelDate, String returnDate) {
    ModelMapper modelMapper = new ModelMapper();
    SearchBusInfoDTO searchBusInfoDTO = new SearchBusInfoDTO();
    List<SearchBusInfoBO> searchBusInfoDTOs = new ArrayList<>();
    List<BusDetails> searchBusDetailsList = new ArrayList<>();

    // Get Bus Details based on search
    if (null != travelDate && null == returnDate) {
      searchBusDetailsList =
          busDetailsRepository.findBySearchTravelDate(sourceCity, destinationCity);
    } else if (null != returnDate && null != travelDate) {
      searchBusDetailsList =
          busDetailsRepository.findBySearchReturnDate(sourceCity, destinationCity);
    }
    logger.debug("searchBusDetails :: searchBusDetailsList ==>> {}  ", searchBusDetailsList);

    // Custom Sorting
    Comparator<BusDetails> groupByComparator =
        Comparator.comparing(BusDetails::getBusName)
            .thenComparing(BusDetails::getStartTime)
            .thenComparing(BusDetails::getArrivalTime)
            .thenComparing(BusDetails::getDuration);
    searchBusDetailsList.sort(groupByComparator);
    logger.debug("searchBusDetails :: Custom Sorting ==>> {}  ", searchBusDetailsList);

    for (BusDetails busDetails : searchBusDetailsList) {
      searchBusInfoDTOs.add(modelMapper.map(busDetails, SearchBusInfoBO.class));
    }
    searchBusInfoDTO.setSearchBusInfoList(searchBusInfoDTOs);
    searchBusInfoDTO.setTotalNoOfResults(searchBusDetailsList.size());

    return searchBusInfoDTO;
  }
}
