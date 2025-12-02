package Exercicio10.domain.events;

import java.time.LocalDateTime;
import java.util.UUID;

public interface DomainEvent {
    UUID getEventId();
    LocalDateTime getOcorridoEm();
    String getEventType();
}
