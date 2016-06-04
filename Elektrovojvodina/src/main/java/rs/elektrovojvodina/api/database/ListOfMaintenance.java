package rs.elektrovojvodina.api.database;

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
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "datum_kreiranja")
	private Date dateOfCreation;
	
	@Column(name = "tip_aktivnosti")
	private String activityType;
	
	@Column(name = "grupa_aktivnosti")
	private String activityGroup;
}
