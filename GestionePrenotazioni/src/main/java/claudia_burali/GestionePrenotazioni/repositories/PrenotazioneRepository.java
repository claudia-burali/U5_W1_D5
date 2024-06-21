package claudia_burali.GestionePrenotazioni.repositories;

import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Long> {
}
