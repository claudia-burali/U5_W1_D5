package claudia_burali.GestionePrenotazioni;

import claudia_burali.GestionePrenotazioni.entities.Edificio;
import claudia_burali.GestionePrenotazioni.entities.Postazione;
import claudia_burali.GestionePrenotazioni.entities.Prenotazione;
import claudia_burali.GestionePrenotazioni.entities.Utente;
import claudia_burali.GestionePrenotazioni.enums.TipoPostazione;
import claudia_burali.GestionePrenotazioni.services.EdificioService;
import claudia_burali.GestionePrenotazioni.services.PostazioneService;
import claudia_burali.GestionePrenotazioni.services.PrenotazioneService;
import claudia_burali.GestionePrenotazioni.services.UtenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private UtenteService utenteService;
    @Autowired
    private EdificioService edificioService;
    @Autowired
    private PostazioneService postazioneService;
    @Autowired
    private PrenotazioneService prenotazioneService;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner");
        Utente utente1 = new Utente("Mario789", "Mario Rossi", "mario.rossi@epicode.com");
        Utente utente2 = new Utente("Gianni99", "Giovanni Verdi", "giovanni.verdi@epicode.com");
        Utente utente3 = new Utente("Fra89", "Francesca Bianchi", "francesca.bianchi@epicode.com");

        utenteService.saveUtente(utente1);
        utenteService.saveUtente(utente2);
        utenteService.saveUtente(utente3);

        Edificio edificio1 = new Edificio("Open Studio", "via Roma, 10", "Milano");
        Edificio edificio2 = new Edificio("Uffici Generali", "piazza Dante, 2", "Roma");
        Edificio edificio3 = new Edificio("Casa Ghianda", "viale Liberazione, 123", "Firenze");

        edificioService.saveEdificio(edificio1);
        edificioService.saveEdificio(edificio2);
        edificioService.saveEdificio(edificio3);

        Postazione postazione1 = new Postazione("ufficio luminoso", TipoPostazione.OPENSPACE, 42, edificio3 );
        Postazione postazione2 = new Postazione("sala silenziosa", TipoPostazione.SALA_RIUNIONI, 15, edificio3 );
        Postazione postazione3 = new Postazione("cubicolo accogliente", TipoPostazione.PRIVATO, 3,edificio1 );
        Postazione postazione4 = new Postazione("rilassante spazio condiviso", TipoPostazione.OPENSPACE, 35, edificio2);
        Postazione postazione5 = new Postazione("sala spaziosa", TipoPostazione.SALA_RIUNIONI, 25, edificio2 );

        postazioneService.savePostazione(postazione1);
        postazioneService.savePostazione(postazione2);
        postazioneService.savePostazione(postazione3);
        postazioneService.savePostazione(postazione4);
        postazioneService.savePostazione(postazione5);

        Prenotazione prenotazione1 = new Prenotazione(postazione1, utente1, LocalDate.of(2024, 7, 12));
        Prenotazione prenotazione2 = new Prenotazione(postazione1, utente3, LocalDate.of(2024, 6, 30));
        Prenotazione prenotazione3 = new Prenotazione(postazione2, utente2, LocalDate.of(2024, 7, 3));
        Prenotazione prenotazione4 = new Prenotazione(postazione3, utente1, LocalDate.of(2024, 8, 1));
        Prenotazione prenotazione5 = new Prenotazione(postazione2, utente3, LocalDate.of(2024, 7, 22));

        prenotazioneService.savePrenotazione(prenotazione1);
        prenotazioneService.savePrenotazione(prenotazione2);
        prenotazioneService.savePrenotazione(prenotazione3);
        prenotazioneService.savePrenotazione(prenotazione4);
        prenotazioneService.savePrenotazione(prenotazione5);

    }
}
