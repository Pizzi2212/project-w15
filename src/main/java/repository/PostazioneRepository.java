package repository;


import entities.Postazione;
import entities.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTipoAndEdifcioCitta(TipoPostazione tipo, String citta);
}