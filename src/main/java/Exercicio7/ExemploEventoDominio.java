package Exercicio7;

import Exercicio7.service.AdocaoService;

public class ExemploEventoDominio {

    public static void main(String[] args) {
        System.out.println("=== Pet Friends - Sistema de Adoções ===\n");

        AdocaoService service = new AdocaoService();

        System.out.println("--- Registrando adoção ---");
        service.registrarAdocao("Rex", "Maria Silva");

        System.out.println("\n--- Registrando outra adoção ---");
        service.registrarAdocao("Luna", "João Santos");
    }
}


