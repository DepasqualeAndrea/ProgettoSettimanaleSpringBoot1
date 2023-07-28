package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti.Utente;

@Repository
public interface UtenteRepo extends JpaRepository<Utente, Integer> {
//	// "select u from user where name= :name"
//	optional<Utente> findbyname(string name);
//
//	optional<Utente> findbyid(int id);
//
//	// "select u from user where name= :name or prezzo = :prezzo"
//	// list<Utente> findbyname();
//
//	// "select u from user where lower(u.name) like concat(lower(:name), '%')
//	list<utente> findbynamestartingwithignorecase(string name);
//
//	// docs https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
}
