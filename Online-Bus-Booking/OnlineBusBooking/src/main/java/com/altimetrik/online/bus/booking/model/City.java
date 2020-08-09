package com.altimetrik.online.bus.booking.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "CITY")
public class City {

    @Id
    @Column(name = "code")
    Long code;

    @Column(name = "city_name")
    String cityName;

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
