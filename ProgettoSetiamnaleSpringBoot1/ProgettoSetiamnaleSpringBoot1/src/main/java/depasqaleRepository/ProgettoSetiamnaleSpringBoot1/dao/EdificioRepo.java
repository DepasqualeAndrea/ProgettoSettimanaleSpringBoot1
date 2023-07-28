package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Edificio;

@Repository
public interface EdificioRepo extends JpaRepository<Edificio, Integer> {

}
