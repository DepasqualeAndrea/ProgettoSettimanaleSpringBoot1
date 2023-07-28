package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Edificio;
import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.exception.ItemsNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EdificioService implements EdificioDao {
	@Autowired
	private EdificioRepo edificiorepo;

	public void save(Edificio edificio) {
		edificiorepo.save(edificio);
		log.info(edificio.getNome() + "edificio salvato Correttamente");
	}

	public List<Edificio> findAll() {
		return edificiorepo.findAll();
	}

	public Edificio findById(int id) throws ItemsNotFoundException {
		Optional<Edificio> edificio = edificiorepo.findById(id);

		if (edificio.isPresent()) {
			return edificio.get();
		} else {
			throw new ItemsNotFoundException(id);
		}
		// return utenteRepo.findById(id).orElseThrow(() -> new
		// ItemsNotFoundException(id));
	}

	public void findByIdAndUpdate(int id, Edificio edificio) throws ItemsNotFoundException {
		Edificio found = this.findById(id);
		found.setCitta(edificio.getCitta());
		found.setIndirizzo(edificio.getIndirizzo());
		found.setNome(edificio.getNome());
		edificiorepo.save(found);
	}

	public void findByIdAndDelete(int id) throws ItemsNotFoundException {
		Edificio found = this.findById(id);
		edificiorepo.delete(found);
	}

	public long count() {
		return edificiorepo.count();
	}

//	public List<Edificio> findByPartialNameIgnoreCase(String name) {
//		return edificiorepo.findByNameStartingWithIgnoreCase(name);
//	}
}
