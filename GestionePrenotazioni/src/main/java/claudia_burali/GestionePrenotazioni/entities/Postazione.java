package claudia_burali.GestionePrenotazioni.entities;

import claudia_burali.GestionePrenotazioni.enums.TipoPostazione;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private TipoPostazione tipo;
    private int maxOccupanti;

    @ManyToOne
    @JoinColumn(name = "edificio_id", nullable = false)
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")
    private List<Prenotazione> PrenotazioneList;

    public Postazione(String descrizione, TipoPostazione tipo, int maxOccupanti, Edificio edificio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxOccupanti = maxOccupanti;
        this.edificio = edificio;
    }

}
