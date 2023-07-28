package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Prenotazione;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PrenotazioneService implements PrenotazioneDao {
//	@Override
//	public void save(Prenotazione edificio) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void findByIdAndUpdate(int id, Prenotazione prenotazione) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void findByIdAndDelete(int id) {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public Prenotazione findById(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Prenotazione> findAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	@Autowired
	private PrenotazioneRepo prenotazionerepo;

	public void save(Prenotazione prenotazione) {
		prenotazionerepo.save(prenotazione);
		log.info(prenotazione.getDataprenotazione() + "Prenotazione in data effettuata Correttamente");
	}

	public List<Prenotazione> findAll() {
		return prenotazionerepo.findAll();
	}

	public Prenotazione findById(int id) throws ItemsNotFoundException {
		Optional<Prenotazione> utente = prenotazionerepo.findById(id);

		if (utente.isPresent()) {
			return utente.get();
		} else {
			throw new ItemsNotFoundException(id);
		}
		// return utenteRepo.findById(id).orElseThrow(() -> new
		// ItemsNotFoundException(id));
	}

//	public void findByIdAndUpdate(int id, Prenotazione prenotazione) throws ItemsNotFoundException {
//		Prenotazione found = this.findById(id);
//		found.setDataprenotazione(prenotazione.getDataprenotazione());
//		prenotazionerepo.save(found);
//	}

	public void findByIdAndDelete(int id) throws ItemsNotFoundException {
		Prenotazione found = this.findById(id);
		prenotazionerepo.delete(found);
	}

	public long count() {
		return prenotazionerepo.count();
	}

	@Override
	public void findByIdAndUpdate(int id, Prenotazione prenotazione) {
		// TODO Auto-generated method stub

	}

//	public List<Utente> findByPartialNameIgnoreCase(String name) {
//		return utenterepo.findByNameStartingWithIgnoreCase(name);
//	}

}
