package com.app.test11.repo;

import com.app.test11.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
}
