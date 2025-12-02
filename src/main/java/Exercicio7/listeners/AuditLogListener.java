package Exercicio7.listeners;

import Exercicio7.domain.events.DomainEvent;
import Exercicio7.domain.events.EventListener;

public class AuditLogListener implements EventListener {

    @Override
    public void onEvent(DomainEvent event) {
        registrarAuditoria(event);
    }

    private void registrarAuditoria(DomainEvent event) {
        System.out.println("\n[Auditoria] Evento registrado: " + event.getEventType());
        System.out.println("[Auditoria] ID: " + event.getEventId());
        System.out.println("[Auditoria] Data/Hora: " + event.getOcorridoEm());
    }
}

