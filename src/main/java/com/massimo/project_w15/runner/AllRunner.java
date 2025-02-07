package com.massimo.project_w15.runner;

import com.massimo.project_w15.entities.Edificio;
import com.massimo.project_w15.entities.Postazione;
import com.massimo.project_w15.entities.TipoPostazione;
import com.massimo.project_w15.entities.Utente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.massimo.project_w15.repository.EdificioRepository;
import com.massimo.project_w15.repository.PostazioneRepository;
import com.massimo.project_w15.repository.UtenteRepository;

import org.springframework.transaction.annotation.Transactional;

@Component
public class AllRunner implements CommandLineRunner {

    private final EdificioRepository edificioRepository;
    private final PostazioneRepository postazioneRepository;
    private final UtenteRepository utenteRepository;

    public AllRunner(EdificioRepository edificioRepository, PostazioneRepository postazioneRepository, UtenteRepository utenteRepository) {
        this.edificioRepository = edificioRepository;
        this.postazioneRepository = postazioneRepository;
        this.utenteRepository = utenteRepository;
    }

    @Override
    @Transactional
    public void run(String... args) {
        Edificio edificio = new Edificio();
        edificio.setNome("Silph S.p.A");
        edificio.setIndirizzo("Zafferanopoli");
        edificio.setCitta("Kanto");
        edificioRepository.save(edificio);

        Postazione postazione = new Postazione();
        postazione.setCodiceUnivoco("1");
        postazione.setDescrizione("Postazione aperta a tutti");
        postazione.setTipo(TipoPostazione.OPENSPACE);
        postazione.setCapacita(100);
        postazione.setEdificio(edificio);
        postazioneRepository.save(postazione);

        Utente utente = new Utente();
        utente.setUsername("Champ");
        utente.setNomeCompleto("Red");
        utente.setEmail("red.kanto@pokemon.com");
        utenteRepository.save(utente);

        System.out.println("✅ Dati inizializzati correttamente!");
    }
}

