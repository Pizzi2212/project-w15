package com.massimo.project_w15.controller;

import com.massimo.project_w15.entities.Prenotazione;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazione")
public class PrenotazioneController {

    @Autowired
    private PrenotazioneService prenotazioneService;

    @PostMapping
    public Prenotazione createPrenotazione(Prenotazione prenotazione) {
        return prenotazioneService.createPrenotazione(prenotazione);
    }
}
