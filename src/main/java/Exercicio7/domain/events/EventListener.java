package Exercicio7.domain.events;

public interface EventListener {
    void onEvent(DomainEvent event);
}

