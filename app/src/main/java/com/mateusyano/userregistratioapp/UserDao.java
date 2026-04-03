package com.mateusyano.userregistratioapp;

// 0 Data Acess Object é o componente que serve para persistencia de dados. Serve para definir as operaçoes que podem ser feitas no banco de dados com relação a entidade User

//importa as anotaçoes do room necessarias para definir o DAO(data Acess Object)
import androidx.room.Dao;
import androidx.room.Insert;
import  androidx.room.Query;

//importa  a classe List do java para retornar uma lista de usuarios
import java.util.List;

@Dao
public interface UserDao {
    //Metodo para inserir um usuario na tabela do BD
    //A anotaçao @Insert informa a room que este metodo deve ser usado para inserir dado
    @Insert
    void insert(User user);

    //metodo para buscar todos os usuarios cadastrados no BD
    //A anotaçao @Query permite definir uma consulta SQL personalizada
    @Query("SELECT * FROM user")
    List<User> getAllUsers();

}
