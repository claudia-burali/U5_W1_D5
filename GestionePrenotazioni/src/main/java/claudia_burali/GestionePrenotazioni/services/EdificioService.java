package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Edificio;
import claudia_burali.GestionePrenotazioni.repositories.EdificioRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EdificioService {
    private final EdificioRepository edificioRepository;
    public EdificioService(EdificioRepository edificioRepository) {
        this.edificioRepository = edificioRepository;
    }
    public void saveEdificio(Edificio edificio) {
        edificioRepository.save(edificio);
    }

}
