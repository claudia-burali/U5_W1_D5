package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import claudia_burali.GestionePrenotazioni.repositories.PrenotazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrenotazioneService {
    @Autowired
    private PrenotazioneRepository prenotazioneRepository;
    public void savePrenotazione(Prenotazione prenotazione) {

        /*List<Prenotazione> prenotazionePresente = prenotazioneRepository.findByUsername_UtenteEDataPrenotazione(prenotazione.getUtente().getUsername(), prenotazione.getDataPrenotazione());
        if (!prenotazionePresente.isEmpty()){
             throw new RuntimeException("Impossibile prenotare, postazione occupata.");
        }*/

        prenotazioneRepository.save(prenotazione);
        System.out.println("Nuova prenotazione " + prenotazione + " aggiunta.");
        }
}
