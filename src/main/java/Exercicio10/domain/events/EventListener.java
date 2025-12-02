package Exercicio10.domain.events;

public interface EventListener {
    void onEvent(DomainEvent event);
}
