package claudia_burali.GestionePrenotazioni.services;

import claudia_burali.GestionePrenotazioni.entities.Postazione;
import claudia_burali.GestionePrenotazioni.enums.TipoPostazione;
import claudia_burali.GestionePrenotazioni.repositories.PostazioneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostazioneService {
    @Autowired
    private  PostazioneRepository postazioneRepository;
    public void savePostazione(Postazione postazione) {
        postazioneRepository.save(postazione);
        System.out.println("Nuova postazione " + postazione + " salvata.");
    }
    /*public List<Postazione> cercaPostazioni(TipoPostazione tipo, String citta){
        return postazioneRepository.findByTipoPostazioneECitta(tipo, citta);
    }*/
}
