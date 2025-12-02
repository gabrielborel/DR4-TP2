package Exercicio7.domain.events;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdocaoCriadaEvent implements DomainEvent {
    private final UUID eventId;
    private final LocalDateTime ocorridoEm;
    private final UUID adocaoId;
    private final UUID petId;
    private final String nomePet;
    private final UUID tutorId;
    private final String nomeTutor;

    public AdocaoCriadaEvent(UUID adocaoId, UUID petId, String nomePet, UUID tutorId, String nomeTutor) {
        this.eventId = UUID.randomUUID();
        this.ocorridoEm = LocalDateTime.now();
        this.adocaoId = adocaoId;
        this.petId = petId;
        this.nomePet = nomePet;
        this.tutorId = tutorId;
        this.nomeTutor = nomeTutor;
    }

    @Override
    public UUID getEventId() {
        return eventId;
    }

    @Override
    public LocalDateTime getOcorridoEm() {
        return ocorridoEm;
    }

    @Override
    public String getEventType() {
        return "AdocaoCriada";
    }

    public UUID getAdocaoId() {
        return adocaoId;
    }

    public UUID getPetId() {
        return petId;
    }

    public String getNomePet() {
        return nomePet;
    }

    public UUID getTutorId() {
        return tutorId;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    @Override
    public String toString() {
        return String.format(
            "AdocaoCriadaEvent{eventId=%s, tipo='%s', ocorridoEm=%s, adocaoId=%s, pet='%s' (ID: %s), tutor='%s' (ID: %s)}",
            eventId, getEventType(), ocorridoEm, adocaoId, nomePet, petId, nomeTutor, tutorId
        );
    }
}

