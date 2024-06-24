package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Utente;
import claudia_burali.GestionePrenotazioni.repositories.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtenteService {
    @Autowired
    private  UtenteRepository utenteRepository;
    public void saveUtente(Utente utente) {
        utenteRepository.save(utente);
        System.out.println("Nuovo utente " + utente + " salvato.");
    }
}
