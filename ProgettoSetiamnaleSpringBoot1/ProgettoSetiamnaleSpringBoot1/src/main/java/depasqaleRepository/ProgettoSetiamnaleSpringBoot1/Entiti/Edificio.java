package depasqaleRepository.ProgettoSetiamnaleSpringBoot1.Entiti;

import java.util.List;

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

@Entity
@Table(name = "edificio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Edificio {
	@Id
	@GeneratedValue
	private int id;
	private String nome;
	private String indirizzo;
	private String citta;

	public Edificio(String nome, String indirizzo, String citta) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.citta = citta;
	}

	@OneToMany(mappedBy = "edificio")
	private List<Postazione> postazioni;;
}
