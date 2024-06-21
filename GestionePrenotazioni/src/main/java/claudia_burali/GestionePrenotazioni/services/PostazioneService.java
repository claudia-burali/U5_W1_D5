package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Postazione;
import claudia_burali.GestionePrenotazioni.repositories.PostazioneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PostazioneService {
    private final PostazioneRepository postazioneRepository;
    public PostazioneService(PostazioneRepository postazioneRepository) {
        this.postazioneRepository = postazioneRepository;
    }
    public void savePostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
    }
}