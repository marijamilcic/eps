package rs.elektrovojvodina.api.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kalendar_odrzavanja")
public class CalendarOfMaintenance {

	@Id
	@Column(name = "id_kalendara")
	private int CalendarID;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "datum_kreiranja")
	private Date dateOfCreation;
	
	@Column(name = "tip_aktivnosti")
	private String activityType;
	
	@Column(name = "grupa_aktivnosti")
	private String activityGroup;
	
	public CalendarOfMaintenance(){
		
	}

	public CalendarOfMaintenance(int calendarID, String status, Date dateOfCreation, String activityType,
			String activityGroup) {
		super();
		CalendarID = calendarID;
		this.status = status;
		this.dateOfCreation = dateOfCreation;
		this.activityType = activityType;
		this.activityGroup = activityGroup;
	}

	public int getCalendarID() {
		return CalendarID;
	}

	public void setCalendarID(int calendarID) {
		CalendarID = calendarID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public String getActivityType() {
		return activityType;
	}

	public void setActivityType(String activityType) {
		this.activityType = activityType;
	}

	public String getActivityGroup() {
		return activityGroup;
	}

	public void setActivityGroup(String activityGroup) {
		this.activityGroup = activityGroup;
	}

	@Override
	public String toString() {
		return "CalendarID=" + CalendarID + ", status=" + status + ", dateOfCreation="
				+ dateOfCreation + ", activityType=" + activityType + ", activityGroup=" + activityGroup;
	}
	
	
}
