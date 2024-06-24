package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Edificio;
import claudia_burali.GestionePrenotazioni.repositories.EdificioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdificioService {
    @Autowired
    private EdificioRepository edificioRepository;
    public void saveEdificio(Edificio edificio) {
        edificioRepository.save(edificio);
        System.out.println("Nuovo edificio " + edificio + " aggiunto.");
    }

}
