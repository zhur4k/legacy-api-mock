package com.legacyapimock.controller;

import com.legacyapimock.dto.ClientNotesRequestDto;
import com.legacyapimock.model.Client;
import com.legacyapimock.model.Note;
import com.legacyapimock.service.MockLegacyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class LegacyController {

    private final MockLegacyService mockLegacyService;

    public LegacyController(MockLegacyService mockLegacyService) {
        this.mockLegacyService = mockLegacyService;
    }

    @PostMapping("clients")
    public ResponseEntity<List<Client>> getClients(){
        return ResponseEntity.ok(mockLegacyService.getClients());
    }

    @PostMapping("notes")
    public ResponseEntity<List<Note>> getClientNotes(@RequestBody ClientNotesRequestDto clientNotesRequestDto) {
        return ResponseEntity.ok(mockLegacyService.getNotes(clientNotesRequestDto));
    }
}
