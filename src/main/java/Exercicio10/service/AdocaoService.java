package Exercicio10.service;

import Exercicio10.domain.events.AdocaoCriadaEvent;
import Exercicio10.domain.events.EventPublisher;

import java.util.UUID;

public class AdocaoService {

    public void registrarAdocao(String nomePet, String nomeTutor) {
        UUID adocaoId = UUID.randomUUID();

        System.out.println("Registrando adoção...");
        System.out.println("Pet: " + nomePet + " | Tutor: " + nomeTutor);

        AdocaoCriadaEvent evento = new AdocaoCriadaEvent(adocaoId, nomePet, nomeTutor);
        EventPublisher.publish(evento);
    }
}
