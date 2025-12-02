package Exercicio7.service;

import Exercicio7.domain.Adocao;
import Exercicio7.domain.StatusAdocao;
import Exercicio7.domain.events.AdocaoCriadaEvent;
import Exercicio7.domain.events.EventPublisher;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AdocaoService {
    private final List<Adocao> adocoes = new ArrayList<>();

    public Adocao criarAdocao(UUID petId, String nomePet, UUID tutorId, String nomeTutor) {
        Adocao adocao = new Adocao(UUID.randomUUID(), petId, nomePet, tutorId, nomeTutor);
        adocoes.add(adocao);

        System.out.println("Adoção registrada: " + adocao.getId());

        AdocaoCriadaEvent evento = new AdocaoCriadaEvent(
            adocao.getId(),
            adocao.getPetId(),
            adocao.getNomePet(),
            adocao.getTutorId(),
            adocao.getNomeTutor()
        );

        EventPublisher.publish(evento);

        return adocao;
    }

    public void aprovarAdocao(UUID adocaoId) {
        Adocao adocao = buscarAdocao(adocaoId);
        if (adocao == null) {
            throw new IllegalArgumentException("Adoção não encontrada");
        }

        adocao.setStatus(StatusAdocao.APROVADA);
        System.out.println("Adoção aprovada: " + adocaoId);
    }

    public Adocao buscarAdocao(UUID adocaoId) {
        return adocoes.stream()
            .filter(a -> a.getId().equals(adocaoId))
            .findFirst()
            .orElse(null);
    }

    public List<Adocao> listarAdocoes() {
        return new ArrayList<>(adocoes);
    }
}

