package Exercicio7.domain;

public enum StatusAdocao {
    PENDENTE("Pendente de aprovação"),
    APROVADA("Aprovada"),
    REJEITADA("Rejeitada"),
    CONCLUIDA("Concluída");

    private final String descricao;

    StatusAdocao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

