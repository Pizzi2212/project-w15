package com.massimo.project_w15.repository;


import com.massimo.project_w15.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}