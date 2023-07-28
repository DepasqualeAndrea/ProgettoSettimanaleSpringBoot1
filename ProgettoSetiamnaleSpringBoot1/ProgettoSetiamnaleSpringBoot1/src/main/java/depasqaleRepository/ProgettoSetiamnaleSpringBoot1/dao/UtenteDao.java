package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;

public interface UtenteDao {

	public void save(Utente utente);

	public void findByIdAndUpdate(int id, Utente utente);

	public void findByIdAndDelete(int id);

	public Utente findById(int id);

	public List<Utente> findAll();

//	public long count();

	// public List<Utente> findByPartialNameIgnoreCase(String name);

}
