package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.repositories.PrenotazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PrenotazioneService {
    private PrenotazioneRepository prenotazioneRepository;
}
