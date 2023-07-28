package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Postazione;

public interface PostazioneDao {

	public void save(Postazione postazione);

	public void findByIdAndUpdate(int id, Postazione postazione);

	public void findByIdAndDelete(int id);

	public Postazione findById(int id);

	public List<Postazione> findAll();

	public long count();

//	public List<Postazione> findByPartialNameIgnoreCase(String descrizione);
}
