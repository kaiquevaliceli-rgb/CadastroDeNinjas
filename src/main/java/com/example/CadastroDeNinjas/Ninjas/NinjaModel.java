package com.example.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;


@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private  int idade;

    //@ManyToOne tem uma única missão.
    @ManyToOne
    //@JoinColumn usado para juntar as colunas, neste caso as duas que temos. Juntar a coluna de missoes com a coluna de ninjas. Criando uma nova coluna no banco de dados, que será nomeada abaixo como "missoes_id"
    @JoinColumn(name= "Missoes_id") //Então o "missoes_id" é uma Foreing Key ou Chave estrangeira (ou seja, uma outra coluna, neste caso um terceiro endereço mapeado que representa a junção de duas ou mais tabelas)
    private list <MissoesModel> missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }







}
