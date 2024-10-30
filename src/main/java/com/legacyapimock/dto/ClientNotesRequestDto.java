package com.legacyapimock.dto;

import java.time.LocalDate;
import java.util.UUID;

public record ClientNotesRequestDto (

    String agency,

    LocalDate dateFrom,

    LocalDate dateTo,

    UUID clientGuid
){}
