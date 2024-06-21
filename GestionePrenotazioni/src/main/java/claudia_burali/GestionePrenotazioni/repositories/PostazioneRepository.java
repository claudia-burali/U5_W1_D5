package claudia_burali.GestionePrenotazioni.repositories;


import claudia_burali.GestionePrenotazioni.entities.Postazione;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
}
