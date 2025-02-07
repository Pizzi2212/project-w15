package com.massimo.project_w15.repository;

import com.massimo.project_w15.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
    List<Prenotazione> findByUtenteIdAndDataPrenotazione(Long utenteId, LocalDate dataPrenotazione);
    List<Prenotazione> findByPostazioneIdAndDataPrenotazione(Long postazioneId, LocalDate dataPrenotazione);
}