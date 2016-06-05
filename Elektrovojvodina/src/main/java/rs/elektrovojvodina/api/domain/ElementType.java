package rs.elektrovojvodina.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tip_elementa")
public class ElementType {

	@Id
	@Column(name= "id_tipa")
	private int typeID;
	
	@Column(name= "opis_tipa")
	private String description;
	
	@Column(name= "id_sablona")
	private Pattern patternID;
	
	public ElementType(){
		
	}

	public ElementType(int typeID, String description, Pattern patternID) {
		super();
		this.typeID = typeID;
		this.description = description;
		this.patternID = patternID;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Pattern getPatternID() {
		return patternID;
	}

	public void setPatternID(Pattern patternID) {
		this.patternID = patternID;
	}

	@Override
	public String toString() {
		return "typeID=" + typeID + ", description=" + description + ", patternID=" + patternID;
	}
	
}
