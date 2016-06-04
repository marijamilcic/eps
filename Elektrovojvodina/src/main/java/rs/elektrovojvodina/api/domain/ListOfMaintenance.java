package rs.elektrovojvodina.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "lista_odrzavanja")
public class ListOfMaintenance {
	
	@Id
	@Column(name = "id_sablona")
	private int patternID;
	
	@Id
	@Column(name = "id_liste")
	private int listID;
	
	@Column(name = "stanje")
	private String state;
	
	@Column(name = "datum_kreiranja")
	private Date dateOfCreation;
	
	@Column(name = "datum_dodele_korisniku")
	private Date dateOfUserClaiming;
	
	@Column(name = "planirani_datum_izvrsenja")
	private Date planedDateOfexecution;
	
	@Column(name = "datum_zatvanja")
	private Date dateOfClosing;
	
	@Column(name = "datum_revizije")
	private Date dateOfRevision;
	
}
