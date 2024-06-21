package claudia_burali.GestionePrenotazioni.repositories;

import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
