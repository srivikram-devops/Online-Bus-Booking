package com.altimetrik.online.bus.booking.dao;

import com.altimetrik.online.bus.booking.model.BusDetails;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Qualifier("busDetailsRepository")
@Repository
public interface BusDetailsRepository extends CrudRepository<BusDetails, Long> {

  @Query(
      value =
          "(SELECT * FROM bus_details WHERE departure_code=:sourceCity AND arrival_code=:destinationCity AND is_active = 'Y')",
      nativeQuery = true)
  List<BusDetails> findBySearchTravelDate(
      @Param("sourceCity") Integer sourceCity, @Param("destinationCity") Integer destinationCity);

  @Query(
      value =
          "(SELECT * FROM bus_details WHERE departure_code=:sourceCity AND arrival_code=:destinationCity AND is_active = 'Y') UNION (SELECT * FROM bus_details WHERE departure_code=:destinationCity AND arrival_code=:sourceCity AND is_active = 'Y')",
      nativeQuery = true)
  List<BusDetails> findBySearchReturnDate(
      @Param("sourceCity") Integer sourceCity, @Param("destinationCity") Integer destinationCity);
}
