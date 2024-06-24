package claudia_burali.GestionePrenotazioni.repositories;


import claudia_burali.GestionePrenotazioni.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
   // Utente findByUsername(String username);
}