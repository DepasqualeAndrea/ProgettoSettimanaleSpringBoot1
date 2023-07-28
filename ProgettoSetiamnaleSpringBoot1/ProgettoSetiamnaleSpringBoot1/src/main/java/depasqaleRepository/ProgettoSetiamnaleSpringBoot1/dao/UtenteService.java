package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UtenteService implements UtenteDao {
	@Autowired
	private UtenteRepo utenterepo;

	public void save(Utente utente) {
		utenterepo.save(utente);
		log.info(utente.getUserName() + "Utente salvato Correttamente");
	}

	public List<Utente> findAll() {
		return utenterepo.findAll();
	}

	public Utente findById(int id) throws ItemsNotFoundException {
		Optional<Utente> utente = utenterepo.findById(id);

		if (utente.isPresent()) {
			return utente.get();
		} else {
			throw new ItemsNotFoundException(id);
		}
		// return utenteRepo.findById(id).orElseThrow(() -> new
		// ItemsNotFoundException(id));
	}

	public void findByIdAndUpdate(int id, Utente utente) throws ItemsNotFoundException {
		Utente found = this.findById(id);
		found.setId(id);
		found.setUserName(utente.getUserName());
		found.setEmail(utente.getEmail());
		found.setNomeCompleto(utente.getNomeCompleto());
		utenterepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemsNotFoundException {
		Utente found = this.findById(id);
		utenterepo.delete(found);
	}

	public long count() {
		return utenterepo.count();
	}

//	public List<Utente> findByPartialNameIgnoreCase(String name) {
//		return utenterepo.findByNameStartingWithIgnoreCase(name);
//	}
}
