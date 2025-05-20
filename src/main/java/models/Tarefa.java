package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarefa")
public class Tarefa {
    @Id
    private int id;

    private String nome;

    public Tarefa(int id, String nome, String descricao,
                  String prioridade, LocalDate dataVencimento, String status,
                  LocalDate dataConclusao) {

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataVencimento = dataVencimento;
        this.status = status;
        this.dataConclusao = dataConclusao;
    }

    private String descricao;
    private String prioridade;
    private LocalDate dataVencimento;
    private String status;
    private LocalDate dataConclusao;

public Tarefa(){};
}
