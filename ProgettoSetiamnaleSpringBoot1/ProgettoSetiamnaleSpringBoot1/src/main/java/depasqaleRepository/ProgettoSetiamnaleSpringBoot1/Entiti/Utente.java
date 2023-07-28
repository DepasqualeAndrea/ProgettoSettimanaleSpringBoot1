package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Utente {
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	private String nomeCompleto;
	private String email;

	public Utente(String userName, String nomeCompleto, String email, Prenotazione prenotazione,
			Set<Prenotazione> prenotazioni) {
		this.userName = userName;
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.prenotazioni = prenotazioni;
	}

	@OneToMany(mappedBy = "utente")
	private Set<Prenotazione> prenotazioni;

}
