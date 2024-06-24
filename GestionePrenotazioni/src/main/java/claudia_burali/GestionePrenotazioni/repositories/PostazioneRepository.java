package claudia_burali.GestionePrenotazioni.repositories;


import claudia_burali.GestionePrenotazioni.entities.Postazione;
import claudia_burali.GestionePrenotazioni.enums.TipoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
  //List<Postazione> findByTipoPostazioneECitta(TipoPostazione tipo, String citta);
}
