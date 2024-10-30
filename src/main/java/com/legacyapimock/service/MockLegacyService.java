package com.legacyapimock.service;

import com.legacyapimock.dto.ClientNotesRequestDto;
import com.legacyapimock.model.Client;
import com.legacyapimock.model.Note;

import java.util.List;

public interface MockLegacyService {

    List<Client> getClients();

    List<Note> getNotes(ClientNotesRequestDto clientNotesRequestDto);
}
