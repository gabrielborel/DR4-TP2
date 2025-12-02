package Exercicio10.domain.events;

import java.time.LocalDateTime;
import java.util.UUID;

public class AdocaoCriadaEvent implements DomainEvent {
    private final UUID eventId;
    private final LocalDateTime ocorridoEm;
    private final UUID adocaoId;
    private final String nomePet;
    private final String nomeTutor;

    public AdocaoCriadaEvent(UUID adocaoId, String nomePet, String nomeTutor) {
        this.eventId = UUID.randomUUID();
        this.ocorridoEm = LocalDateTime.now();
        this.adocaoId = adocaoId;
        this.nomePet = nomePet;
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

    public String getNomePet() {
        return nomePet;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }
}
