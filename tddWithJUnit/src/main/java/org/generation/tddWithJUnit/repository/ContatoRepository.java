package org.generation.tddWithJUnit.repository;

import org.generation.tddWithJUnit.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
