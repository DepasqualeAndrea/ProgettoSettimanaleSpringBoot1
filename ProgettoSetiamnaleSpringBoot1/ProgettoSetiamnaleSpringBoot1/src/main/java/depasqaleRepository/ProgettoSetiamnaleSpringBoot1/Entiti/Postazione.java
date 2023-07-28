package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti;

import java.util.List;

import depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Enum.TipoPostazione;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "postazione")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Postazione {
	@Id
	@GeneratedValue
	private int id;
	private String descrizione;
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;

	public Postazione(String descrizione, TipoPostazione tipoPostazione, List<Prenotazione> prenotazioni,
			Edificio edificio) {
		this.descrizione = descrizione;
		this.tipoPostazione = tipoPostazione;
		this.prenotazioni = prenotazioni;
		this.edificio = edificio;
	}

	@OneToMany(mappedBy = "postazione")
	private List<Prenotazione> prenotazioni;

	@ManyToOne
	private Edificio edificio;

}
