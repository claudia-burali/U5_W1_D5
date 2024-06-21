package claudia_burali.GestionePrenotazioni.repositories;


import claudia_burali.GestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtenteRepository extends JpaRepository<Utente, Long> {
}