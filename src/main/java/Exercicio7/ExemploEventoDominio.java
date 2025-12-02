package Exercicio7;

import Exercicio7.domain.Adocao;
import Exercicio7.domain.events.EventPublisher;
import Exercicio7.listeners.AuditLogListener;
import Exercicio7.listeners.NotificacaoEmailListener;
import Exercicio7.service.AdocaoService;

import java.util.UUID;

public class ExemploEventoDominio {

    public static void main(String[] args) {
        System.out.println("=== Pet Friends - Sistema de Adoções ===\n");

        EventPublisher.subscribe(new NotificacaoEmailListener());
        EventPublisher.subscribe(new AuditLogListener());

        AdocaoService adocaoService = new AdocaoService();

        System.out.println("\n--- Criando primeira adoção ---");
        Adocao adocao1 = adocaoService.criarAdocao(
            UUID.randomUUID(),
            "Rex",
            UUID.randomUUID(),
            "Maria Silva"
        );

        System.out.println("\n--- Criando segunda adoção ---");
        Adocao adocao2 = adocaoService.criarAdocao(
            UUID.randomUUID(),
            "Luna",
            UUID.randomUUID(),
            "João Santos"
        );

        System.out.println("\n--- Aprovando adoções ---");
        adocaoService.aprovarAdocao(adocao1.getId());
        adocaoService.aprovarAdocao(adocao2.getId());

        System.out.println("\n--- Lista de adoções ---");
        adocaoService.listarAdocoes().forEach(System.out::println);
    }
}

