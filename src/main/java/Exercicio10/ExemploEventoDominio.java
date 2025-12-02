package Exercicio10;

import Exercicio10.domain.events.EventPublisher;
import Exercicio10.listeners.AuditLogListener;
import Exercicio10.listeners.NotificacaoEmailListener;
import Exercicio10.service.AdocaoService;

public class ExemploEventoDominio {

    public static void main(String[] args) {
        System.out.println("=== Pet Friends - Sistema de Adoções ===\n");

        EventPublisher.subscribe(new NotificacaoEmailListener());
        EventPublisher.subscribe(new AuditLogListener());

        AdocaoService service = new AdocaoService();

        System.out.println("--- Primeira adoção ---");
        service.registrarAdocao("Rex", "Maria Silva");

        System.out.println("\n--- Segunda adoção ---");
        service.registrarAdocao("Luna", "João Santos");
    }
}
