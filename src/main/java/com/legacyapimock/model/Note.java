package com.legacyapimock.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class Note {

    String comments;

    UUID guid;

    LocalDateTime modifiedDateTime;

    UUID clientGuid;

    LocalDateTime datetime;

    String loggedUser;

    LocalDateTime createdDateTime;

    public Note(String comments, UUID guid, LocalDateTime modifiedDateTime, UUID clientGuid, LocalDateTime datetime, String loggedUser, LocalDateTime createdDateTime) {
        this.comments = comments;
        this.guid = guid;
        this.modifiedDateTime = modifiedDateTime;
        this.clientGuid = clientGuid;
        this.datetime = datetime;
        this.loggedUser = loggedUser;
        this.createdDateTime = createdDateTime;
    }
}
