package com.example.CadastroDeNinjas.Ninjas;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany Uma missão pode ter varios ninjas.
    @OneToMany(mappedBy = "missoes") // Precisamos mapear e conectar atraves de chave estrangeira. Aqui nós mapeamos, no @ManyToOne nos juntamos
    private List<NinjaModel> ninjas;









    public MissoesModel(Long id) {
        this.id = id;
    }


    public MissoesModel(String nome, String dificuldade) {
        this.nome = nome;
        this.dificuldade = dificuldade;
    }







    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }
}