package claudia_burali.GestionePrenotazioni.repositories;

import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
   // List<Prenotazione> findByUsername_UtenteEDataPrenotazione(String username, LocalDate dataPrenotazione);
}
