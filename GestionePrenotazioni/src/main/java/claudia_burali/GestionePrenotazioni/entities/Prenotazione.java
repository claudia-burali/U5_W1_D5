package claudia_burali.GestionePrenotazioni.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "postazione_id", nullable = false)
    private Postazione postazione;

    @ManyToOne
    @JoinColumn(name = "utente_id", nullable = false)
    private Utente utente;

    private LocalDate dataPrenotazione;

    public Prenotazione(Postazione postazione, Utente utente, LocalDate dataPrenotazione) {
        this.postazione = postazione;
        this.utente = utente;
        this.dataPrenotazione = dataPrenotazione;
    }
}

