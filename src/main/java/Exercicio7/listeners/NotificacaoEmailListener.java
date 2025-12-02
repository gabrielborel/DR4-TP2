package Exercicio7.listeners;

import Exercicio7.domain.events.AdocaoCriadaEvent;
import Exercicio7.domain.events.DomainEvent;
import Exercicio7.domain.events.EventListener;

public class NotificacaoEmailListener implements EventListener {

    @Override
    public void onEvent(DomainEvent event) {
        if (event instanceof AdocaoCriadaEvent adocaoEvent) {
            enviarEmailBemVindo(adocaoEvent);
        }
    }

    private void enviarEmailBemVindo(AdocaoCriadaEvent evento) {
        System.out.println("\n[Email] Enviando notificação para: " + evento.getNomeTutor());
        System.out.println("[Email] Assunto: Parabéns pela adoção!");
        System.out.println("[Email] Corpo: Olá " + evento.getNomeTutor() +
            ", parabéns pela adoção do " + evento.getNomePet() + "!");
    }
}

