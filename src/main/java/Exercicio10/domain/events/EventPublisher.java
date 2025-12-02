package Exercicio10.domain.events;

import java.util.ArrayList;
import java.util.List;

public class EventPublisher {
    private static final List<EventListener> listeners = new ArrayList<>();

    public static void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public static void publish(DomainEvent event) {
        System.out.println("\n[EventPublisher] Publicando evento: " + event.getEventType());
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }

    public static void clearListeners() {
        listeners.clear();
    }
}
