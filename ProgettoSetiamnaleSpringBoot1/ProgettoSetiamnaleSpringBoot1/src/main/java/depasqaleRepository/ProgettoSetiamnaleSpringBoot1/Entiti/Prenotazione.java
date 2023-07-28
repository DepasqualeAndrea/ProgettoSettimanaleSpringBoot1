package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "prenotazione")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Prenotazione {
	@Id
	@GeneratedValue
	private int id;

	private LocalDate dataprenotazione;

	public Prenotazione(LocalDate dataprenotazione, Utente utente, Postazione postazione) {
		this.dataprenotazione = dataprenotazione;
		this.utente = utente;
		this.postazione = postazione;
	}

	@ManyToOne
	@JoinColumn(name = "utente_id")
	private Utente utente;

	@ManyToOne
	@JoinColumn(name = "postazione_id")
	private Postazione postazione;
}