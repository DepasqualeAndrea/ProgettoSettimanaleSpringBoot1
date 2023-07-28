package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Postazione;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PostazioneService implements PostazioneDao {
	@Autowired
	private PostazioneRepo postazionerepo;

	public void save(Postazione postazione) {
		postazionerepo.save(postazione);
		log.info(postazione.getDescrizione() + "Utente salvato Correttamente");
	}

	public List<Postazione> findAll() {
		return postazionerepo.findAll();
	}

	public Postazione findById(int id) throws ItemsNotFoundException {
		Optional<Postazione> utente = postazionerepo.findById(id);

		if (utente.isPresent()) {
			return utente.get();
		} else {
			throw new ItemsNotFoundException(id);
		}
		// return utenteRepo.findById(id).orElseThrow(() -> new
		// ItemsNotFoundException(id));
	}

	public void findByIdAndUpdate(int id, Postazione postazione) throws ItemsNotFoundException {
		Postazione found = this.findById(id);
		found.setDescrizione(postazione.getDescrizione());
		found.setEdificio(postazione.getEdificio());
		found.setPrenotazioni(postazione.getPrenotazioni());
		postazionerepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemsNotFoundException {
		Postazione found = this.findById(id);
		postazionerepo.delete(found);
	}

	public long count() {
		return postazionerepo.count();
	}

}
