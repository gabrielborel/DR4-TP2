package Exercicio10.listeners;

import Exercicio10.domain.events.DomainEvent;
import Exercicio10.domain.events.EventListener;

public class AuditLogListener implements EventListener {

    @Override
    public void onEvent(DomainEvent event) {
        System.out.println("[Auditoria] Evento: " + event.getEventType());
        System.out.println("[Auditoria] ID: " + event.getEventId());
        System.out.println("[Auditoria] Data/Hora: " + event.getOcorridoEm());
    }
}
