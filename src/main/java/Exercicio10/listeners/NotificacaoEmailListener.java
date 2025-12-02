package Exercicio10.listeners;

import Exercicio10.domain.events.AdocaoCriadaEvent;
import Exercicio10.domain.events.DomainEvent;
import Exercicio10.domain.events.EventListener;

public class NotificacaoEmailListener implements EventListener {

    @Override
    public void onEvent(DomainEvent event) {
        if (event instanceof AdocaoCriadaEvent adocaoEvent) {
            enviarEmail(adocaoEvent);
        }
    }

    private void enviarEmail(AdocaoCriadaEvent evento) {
        System.out.println("[Email] Enviando para: " + evento.getNomeTutor());
        System.out.println("[Email] Assunto: Parabéns pela adoção do " + evento.getNomePet() + "!");
    }
}
