package com.massimo.project_w15.repository;


import com.massimo.project_w15.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}