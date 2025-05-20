package models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "projeto")
public class Projeto {

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private Usuario responsavel;

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private String projeto_id;
   private String nome;


    private String descricao;
   private String status;
   private LocalDate dataInicio;
   private LocalDate dataprevistaFim;

    public Projeto(String projeto_id, String nome, String descricao,
                   String status, LocalDate dataInicio,
                   LocalDate dataprevistaFim, Long id) {
        this.projeto_id = projeto_id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataprevistaFim = dataprevistaFim;
        this.id = id;
    }
























    private Long id;

    public Projeto() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
