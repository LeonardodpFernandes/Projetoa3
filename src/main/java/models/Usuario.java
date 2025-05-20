package models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")


public class Usuario {
   private int id;


    public Usuario(String nome, String email, String senha, int id) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String nome;
    private String email;
    private String senha;

    public Usuario() {
    }


































    }







