package com.altimetrik.online.bus.booking.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "BUS_DETAILS")
public class BusDetails {

    @Id
    @Column(name = "bus_id")
    Long busId;

    @Column(name = "bus_number")
    String busNumber;

    @Column(name = "bus_name")
    String busName;

    @Column(name = "departure_code")
    String departureCode;

    @Column(name = "arrival_code")
    String arrivalCode;

    @Column(name = "start_time")
    String startTime;

    @Column(name = "arrival_time")
    String arrivalTime;

    @Column(name = "duration")
    String duration;

    @Column(name = "bus_fair")
    String busFair;

    @Column(name = "is_active")
    String isActive;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "creation_date")
    String creationDate;

    @Column(name = "modified_by")
    String modifiedBy;

    @Column(name = "modify_date")
    String modifyDate;
}
