package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import java.util.List;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Edificio;

public interface EdificioDao {

	public void save(Edificio edificio);

	public void findByIdAndUpdate(int id, Edificio edificio);

	public void findByIdAndDelete(int id);

	public Edificio findById(int id);

	public List<Edificio> findAll();

	public long count();

	// public List<Edificio> findByPartialNameIgnoreCase(String nome);
}
