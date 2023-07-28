package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Prenotazione;

@Repository
public interface PrenotazioneRepo extends JpaRepository<Prenotazione, Integer> {

}
