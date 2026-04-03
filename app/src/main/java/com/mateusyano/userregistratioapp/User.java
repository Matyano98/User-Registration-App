package com.mateusyano.userregistratioapp;

//importa anotações do room necessarios para mapear esta classe como uma entidade do banco de dados
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    //define o campo 'id' como chave primaria da tabela e configura para ser gerado automaticamente
    @PrimaryKey(autoGenerate = true)
    private int id;

    //campos que representam as colunas da tabela para armazenar os dados do usuario
    private String name;//nome do usuario
    private String cpf;//cpf do usuario
    private String email;//email do usuario
    private String phone;//telefone do usuario

    //construtor da classe que sera usado para criar novo objeto User
    public User(String name, String cpf, String email, String phone)  {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
        this.phone = phone;
    }

    //metodos getters e setters para acessar e modificar os dados do objeto user
    public int getId() {return id;}
    //define o id do usuario (usado pelo room para preencher automaticamente
    public void setId(int id) {this.id = id;}

    //retorna o nome do usuario
    public String getName() {return name;}

    //retorna o cpf do usuario
    public String getCpf() {return cpf;}

    //retorna o email do usuario
    public String getEmail() {return email;}

    //retorna o telefone do usuario
    public String getPhone() {return phone;}
}
