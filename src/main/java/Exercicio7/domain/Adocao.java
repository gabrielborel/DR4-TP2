package Exercicio7.domain;

import java.time.LocalDate;
import java.util.UUID;

public class Adocao {
    private final UUID id;
    private final UUID petId;
    private final String nomePet;
    private final UUID tutorId;
    private final String nomeTutor;
    private final LocalDate dataAdocao;
    private StatusAdocao status;

    public Adocao(UUID id, UUID petId, String nomePet, UUID tutorId, String nomeTutor) {
        if (petId == null) {
            throw new IllegalArgumentException("Pet ID não pode ser nulo");
        }
        if (tutorId == null) {
            throw new IllegalArgumentException("Tutor ID não pode ser nulo");
        }
        if (nomePet == null || nomePet.isBlank()) {
            throw new IllegalArgumentException("Nome do pet não pode ser vazio");
        }
        if (nomeTutor == null || nomeTutor.isBlank()) {
            throw new IllegalArgumentException("Nome do tutor não pode ser vazio");
        }

        this.id = id;
        this.petId = petId;
        this.nomePet = nomePet;
        this.tutorId = tutorId;
        this.nomeTutor = nomeTutor;
        this.dataAdocao = LocalDate.now();
        this.status = StatusAdocao.PENDENTE;
    }

    public UUID getId() {
        return id;
    }

    public UUID getPetId() {
        return petId;
    }

    public String getNomePet() {
        return nomePet;
    }

    public UUID getTutorId() {
        return tutorId;
    }

    public String getNomeTutor() {
        return nomeTutor;
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public StatusAdocao getStatus() {
        return status;
    }

    public void setStatus(StatusAdocao status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
            "Adocao{id=%s, pet='%s' (ID: %s), tutor='%s' (ID: %s), data=%s, status=%s}",
            id, nomePet, petId, nomeTutor, tutorId, dataAdocao, status
        );
    }
}

