package config;


import entities.Edificio;
import entities.Postazione;
import entities.TipoPostazione;
import entities.Utente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repository.EdificioRepository;
import repository.PostazioneRepository;
import repository.UtenteRepository;
import services.PrenotazioneService;

@Configuration
public class AppConfig {

    @Bean
    public boolean initData(EdificioRepository edificioRepository, PostazioneRepository postazioneRepository, UtenteRepository utenteRepository) {
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
        utente.setNomeCompleto("Red ");
        utente.setEmail("red.kanto@pokemon.com");
        utenteRepository.save(utente);

        return true;
    }

    @Bean
    public PrenotazioneService prenotazioneValidationService() {
        return new PrenotazioneService();
}
}
