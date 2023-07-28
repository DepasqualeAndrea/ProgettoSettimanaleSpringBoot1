package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer> {
//	// "select u from user where name= :name"
//	Optional<Utente> findbyname(String name);
//
//	 Optional<Utente> findbyid(int id);
//
//	List<Utente> findbyuserName(String name);
//
//	// "select u from user where lower(u.name) like concat(lower(:name), '%')
//	 List<Utente> findbynamestartingwithignorecase(String name);

}
