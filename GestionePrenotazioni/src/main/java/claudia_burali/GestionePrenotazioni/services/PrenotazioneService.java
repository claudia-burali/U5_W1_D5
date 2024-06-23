package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import claudia_burali.GestionePrenotazioni.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    private final PrenotazioneRepository prenotazioneRepository;
    public PrenotazioneService(PrenotazioneRepository prenotazioneRepository) {
        this.prenotazioneRepository = prenotazioneRepository;
    }
    public void savePrenotazione(Prenotazione prenotazione) {
        prenotazioneRepository.save(prenotazione);
        System.out.println("Nuova prenotazione " + prenotazione + " aggiunta.");
    }

}
