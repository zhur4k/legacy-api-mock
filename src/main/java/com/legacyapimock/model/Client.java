package com.legacyapimock.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Client {

    private String agency;

    private UUID guid;

    private String firstName;

    private String lastName;

    private String status;

    private LocalDate dob;

    private LocalDateTime createdDateTime;

    public Client(String agency, UUID guid, String firstName, String lastName, String status, LocalDate dob, LocalDateTime createdDateTime) {
        this.agency = agency;
        this.guid = guid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
        this.dob = dob;
        this.createdDateTime = createdDateTime;
    }
}
