package Exercicio7.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdocaoRegistradaEvent {
    private final UUID eventId;
    private final LocalDateTime ocorridoEm;
    private final String nomePet;
    private final String nomeTutor;

    public AdocaoRegistradaEvent(String nomePet, String nomeTutor) {
        this.eventId = UUID.randomUUID();
        this.ocorridoEm = LocalDateTime.now();
        this.nomePet = nomePet;
        this.nomeTutor = nomeTutor;
    }

    public UUID getEventId() {
        return eventId;
    }

    public LocalDateTime getOcorridoEm() {
        return ocorridoEm;
    }

    public String getNomePet() {
        return nomePet;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    @Override
    public String toString() {
        return String.format("AdocaoRegistradaEvent{id=%s, pet='%s', tutor='%s', em=%s}",
            eventId, nomePet, nomeTutor, ocorridoEm);
    }
}
