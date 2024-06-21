package claudia_burali.GestionePrenotazioni.repositories;

import claudia_burali.GestionePrenotazioni.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository<Edificio, Long> {
}
