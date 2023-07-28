package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer> {
//	// "select u from user where name= :name"
//	optional<utente> findbyname(string name);
//
//	optional<utente> findbyid(int id);
//
//	// "select u from user where name= :name or prezzo = :prezzo"
//	// list<pizza> findbynameorprezzo(double prezzo);
//
//	// "select u from user where lower(u.name) like concat(lower(:name), '%')
//	list<utente> findbynamestartingwithignorecase(string name);
//
//	// docs https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
}
