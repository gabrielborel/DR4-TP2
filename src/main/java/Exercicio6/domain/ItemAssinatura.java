package Exercicio6.domain;

import java.math.BigDecimal;

public class ItemAssinatura {
    private String nome;
    private BigDecimal valor;

    public ItemAssinatura(String nome, BigDecimal valor) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome do item não pode ser vazio.");
        }
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor do item deve ser positivo.");
        }

        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }
}


