package Exercicio6.domain;

public enum PeriodicidadeEntrega {
    MENSAL(30),
    TRIMESTRAL(90),
    SEMESTRAL(180),
    ANUAL(365);

    private final int dias;

    PeriodicidadeEntrega(int dias) {
        this.dias = dias;
    }

    public int getDias() {
        return dias;
    }

    public String getDescricao() {
        return switch (this) {
            case MENSAL -> "Mensal (a cada 30 dias)";
            case TRIMESTRAL -> "Trimestral (a cada 90 dias)";
            case SEMESTRAL -> "Semestral (a cada 180 dias)";
            case ANUAL -> "Anual (a cada 365 dias)";
        };
    }
}

