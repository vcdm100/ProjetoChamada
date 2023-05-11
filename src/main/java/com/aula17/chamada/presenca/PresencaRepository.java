package com.aula17.chamada.presenca;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, String> {
	Optional<Presenca> findById(String id);
}
