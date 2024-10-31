package com.legacyapimock.service.impl;

import com.legacyapimock.dto.ClientNotesRequestDto;
import com.legacyapimock.model.Client;
import com.legacyapimock.model.Note;
import com.legacyapimock.service.MockLegacyService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class MockLegacyServiceImpl implements MockLegacyService {
    private final List<Client> clients;
    private final List<Note> notes;

    public MockLegacyServiceImpl() {
        clients = List.of(
                new Client("vhh4", UUID.fromString("01588E84-D45A-EB98-F47F-716073A4F1EF"), "Ne", "Abr", "200", LocalDate.of(1999, 10, 15), LocalDateTime.of(2021, 11, 15, 11, 51, 59)),
                new Client("abc1", UUID.fromString("02929A84-B66B-EA88-F47F-223344A1B2C3"), "Al", "Smith", "200", LocalDate.of(1985, 5, 12), LocalDateTime.of(2021, 10, 22, 9, 33, 44)),
                new Client("xyz2", UUID.fromString("0A11BB22-CCCC-DDDD-EEEE-1234567890AB"), "Jane", "Doe", "200", LocalDate.of(1990, 3, 8), LocalDateTime.of(2021, 9, 15, 14, 22, 35))
        );

        notes = List.of(
                new Note("Followed up with client; client recovery is progressing well.",
                        UUID.randomUUID(), LocalDateTime.of(2021, 8, 16, 15, 34, 12), clients.get(0).getGuid(), LocalDateTime.of(2021, 8, 16, 15, 34, 12), "j.doe", LocalDateTime.of(2021, 9, 10, 9, 25, 47)),
                new Note("Client appointment scheduled.",
                        UUID.randomUUID(), LocalDateTime.of(2021, 9, 1, 10, 45, 10), clients.get(0).getGuid(), LocalDateTime.of(2021, 9, 1, 10, 45, 10), "j.smith", LocalDateTime.of(2021, 9, 1, 10, 45, 10)),
                new Note("Discussed health goals with client.",
                        UUID.randomUUID(), LocalDateTime.of(2021, 7, 20, 14, 12, 32), clients.get(1).getGuid(), LocalDateTime.of(2021, 7, 20, 14, 12, 32), "m.lee", LocalDateTime.of(2021, 7, 20, 14, 12, 32)),
                new Note("Initial consultation with client completed.",
                        UUID.randomUUID(), LocalDateTime.of(2021, 6, 5, 16, 8, 18), clients.get(2).getGuid(), LocalDateTime.of(2021, 6, 5, 16, 8, 18), "p.vasya", LocalDateTime.of(2021, 6, 5, 16, 8, 18)),
                new Note("Reviewed client's progress report.",
                        UUID.randomUUID(), LocalDateTime.of(2021, 8, 10, 12, 5, 30), clients.get(2).getGuid(), LocalDateTime.of(2021, 8, 10, 12, 5, 30), "s.kim", LocalDateTime.of(2021, 8, 10, 12, 5, 30))
        );
    }

    @Override
    public List<Client> getClients() {
        return clients;
    }

    @Override
    public List<Note> getNotes(ClientNotesRequestDto clientNotesRequestDto) {
        return notes.stream()
                .filter(note -> note.getClientGuid().equals(clientNotesRequestDto.clientGuid()))
                .collect(Collectors.toList());
    }
}
