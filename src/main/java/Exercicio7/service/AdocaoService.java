package Exercicio7.service;

import Exercicio7.domain.AdocaoRegistradaEvent;

import java.util.ArrayList;
import java.util.List;

public class AdocaoService {
    private final List<AdocaoRegistradaEvent> eventosPublicados = new ArrayList<>();

    public void registrarAdocao(String nomePet, String nomeTutor) {
        System.out.println("Processando adoção do pet '" + nomePet + "' para " + nomeTutor + "...");

        AdocaoRegistradaEvent evento = new AdocaoRegistradaEvent(nomePet, nomeTutor);
        publicarEvento(evento);

        System.out.println("Adoção registrada com sucesso!");
    }

    private void publicarEvento(AdocaoRegistradaEvent evento) {
        eventosPublicados.add(evento);
        System.out.println("[Evento publicado] " + evento);
    }
}
