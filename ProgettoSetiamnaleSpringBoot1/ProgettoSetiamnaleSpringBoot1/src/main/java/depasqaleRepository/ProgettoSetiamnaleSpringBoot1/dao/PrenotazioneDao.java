package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Prenotazione;

public interface PrenotazioneDao {
	public void save(Prenotazione edificio);

	public void findByIdAndUpdate(int id, Prenotazione prenotazione);

	public void findByIdAndDelete(int id);

	public Prenotazione findById(int id);

	public List<Prenotazione> findAll();

//	public long count();
//
//	public List<Prenotazione> findByPartialNameIgnoreCase(String nome);
}
