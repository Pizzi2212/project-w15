package services;

import entities.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PrenotazioneRepository;

import javax.swing.plaf.PanelUI;
import java.util.List;

@Service
public class PrenotazioneService {

    @Autowired
    private PrenotazioneRepository prenotazioneRepository;

    public Prenotazione createPrenotazione(Prenotazione prenotazione) {
        List<Prenotazione> prenotazioniEsistenti = prenotazioneRepository.findByPostazioneIdAndDataPrenotazione(prenotazione.getPostazione().getId(), prenotazione.getDataPrenotazione());
    if(!prenotazioniEsistenti.isEmpty()) {
    throw new IllegalStateException("La postazione è già prenotata per quella data");
    }
    List<Prenotazione> prenotazioniUtente = prenotazioneRepository.findByUtenteIdAndDataPrenotazione(prenotazione.getUtente().getId(), prenotazione.getDataPrenotazione());
    if(!prenotazioniUtente.isEmpty()) {
    throw new IllegalStateException("L'utente è già prenotato per quella data");
    }
    return prenotazioneRepository.save(prenotazione);
    }
    }
