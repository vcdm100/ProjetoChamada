package com.aula17.chamada.matricula;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, String>, CrudRepository<Matricula, String>  {

}
