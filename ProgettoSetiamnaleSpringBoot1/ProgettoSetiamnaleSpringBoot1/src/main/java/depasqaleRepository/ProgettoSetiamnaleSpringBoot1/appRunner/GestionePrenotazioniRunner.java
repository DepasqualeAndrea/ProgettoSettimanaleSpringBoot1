package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.appRunner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Edificio;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Postazione;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Prenotazione;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Enum.TipoPostazione;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao.EdificioDao;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao.PostazioneDao;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao.PrenotazioneDao;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao.UtenteDao;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class GestionePrenotazioniRunner implements CommandLineRunner {
	@Autowired
	private UtenteDao uDao;
	@Autowired
	private EdificioDao eDao;
	@Autowired
	private PrenotazioneDao pDao;
	@Autowired
	private PostazioneDao postazioneDao;

	@Override
	public void run(String... args) throws Exception {
		try {
			Edificio consov = Edificio.builder().nome("Consov").indirizzo("via roma 43").citta("milano").build();

			Postazione postazione1 = Postazione.builder().descrizione("sportello isee")
					.tipoPostazione(TipoPostazione.PRIVATO).edificio(consov).build();
			Utente ivan = Utente.builder().userName("Ivan").nomeCompleto("Ivan Iansing").email("ivankof@gmail.com")
					.build();
			Prenotazione prenIsee = Prenotazione.builder().dataprenotazione(LocalDate.now()).utente(ivan)
					.postazione(postazione1).build();

			eDao.save(consov);
			log.info("edificio salvato con successo ");
			postazioneDao.save(postazione1);
			log.info("postazione salvata con successo ");
			uDao.save(ivan);
			log.info("utente salvato con successo");
			pDao.save(prenIsee);
			log.info("prenotazione salvata con successo");

			log.info("utente salvato con successo");
		} catch (ItemsNotFoundException e) {
			log.error(e.getMessage());
		}

	}

}
