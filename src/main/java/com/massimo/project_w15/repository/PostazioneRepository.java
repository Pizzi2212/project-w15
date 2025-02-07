package com.massimo.project_w15.repository;


import com.massimo.project_w15.entities.Postazione;
import com.massimo.project_w15.entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdificio_Citta(TipoPostazione tipo, String citta);
}