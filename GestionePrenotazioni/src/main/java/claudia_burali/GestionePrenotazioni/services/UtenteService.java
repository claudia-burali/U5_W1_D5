package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Utente;
import claudia_burali.GestionePrenotazioni.repositories.UtenteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UtenteService {
    private final UtenteRepository utenteRepository;
    public UtenteService(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }
    public void saveUtente(Utente utente) {
        utenteRepository.save(utente);
        System.out.println("Nuovo utente " + utente + " salvato.");
    }
}
