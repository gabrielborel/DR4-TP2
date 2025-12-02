package Exercicio6.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Assinatura {
    private final UUID id;
    private final UUID clienteId;
    private List<ItemAssinatura> itens;
    private PeriodicidadeEntrega periodicidade;
    private boolean ativa;

    public Assinatura(UUID id, UUID clienteId, List<ItemAssinatura> itens, PeriodicidadeEntrega periodicidade) {
        if (clienteId == null)
            throw new IllegalArgumentException("Assinatura deve estar vinculada a um cliente.");
        if (itens == null || itens.isEmpty())
            throw new IllegalArgumentException("Assinatura deve conter ao menos um produto.");
        if (periodicidade == null)
            throw new IllegalArgumentException("Periodicidade deve ser informada.");

        this.id = id;
        this.clienteId = clienteId;
        this.itens = itens;
        this.periodicidade = periodicidade;
        this.ativa = true;
    }

    public UUID getId() { return id; }
    public UUID getClienteId() { return clienteId; }
    public List<ItemAssinatura> getItens() { return itens; }
    public PeriodicidadeEntrega getPeriodicidade() { return periodicidade; }
    public boolean isAtiva() { return ativa; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== DETALHES DA ASSINATURA ===\n");
        sb.append("ID: ").append(id).append("\n");
        sb.append("Cliente ID: ").append(clienteId).append("\n");
        sb.append("Status: ").append(ativa ? "ATIVA" : "CANCELADA").append("\n");
        sb.append("Periodicidade: ").append(periodicidade.getDescricao()).append("\n");
        sb.append("\n--- ITENS DA ASSINATURA ---\n");

        BigDecimal valorTotal = BigDecimal.ZERO;
        for (int i = 0; i < itens.size(); i++) {
            ItemAssinatura item = itens.get(i);
            sb.append((i + 1)).append(". ");
            sb.append(item.getNome());
            sb.append(" - R$ ").append(String.format("%.2f", item.getValor()));
            sb.append("\n");
            valorTotal = valorTotal.add(item.getValor());
        }

        sb.append("\n--- RESUMO ---\n");
        sb.append("Quantidade de itens: ").append(itens.size()).append("\n");
        sb.append("Valor total da assinatura: R$ ").append(String.format("%.2f", valorTotal)).append("\n");
        sb.append("=============================");

        return sb.toString();
    }
}
