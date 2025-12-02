package Exercicio6;

import Exercicio6.domain.Assinatura;
import Exercicio6.domain.ItemAssinatura;
import Exercicio6.domain.PeriodicidadeEntrega;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ExemploAssinatura {

    public static void main(String[] args) {
        ItemAssinatura item1 = new ItemAssinatura("Netflix Premium", new BigDecimal("55.90"));
        ItemAssinatura item2 = new ItemAssinatura("Spotify Family", new BigDecimal("34.90"));
        ItemAssinatura item3 = new ItemAssinatura("Amazon Prime", new BigDecimal("14.90"));

        List<ItemAssinatura> itens = new ArrayList<>();
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);

        Assinatura assinatura = new Assinatura(
            UUID.randomUUID(),
            UUID.randomUUID(),
            itens,
            PeriodicidadeEntrega.MENSAL
        );

        System.out.println(assinatura);
        System.out.println("\n\n");

        List<ItemAssinatura> itens2 = new ArrayList<>();
        itens2.add(new ItemAssinatura("Curso de Java", new BigDecimal("199.90")));
        itens2.add(new ItemAssinatura("Livros Digitais", new BigDecimal("49.90")));

        Assinatura assinatura2 = new Assinatura(
            UUID.randomUUID(),
            UUID.randomUUID(),
            itens2,
            PeriodicidadeEntrega.TRIMESTRAL
        );

        System.out.println(assinatura2);
    }
}

