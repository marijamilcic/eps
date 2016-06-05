package rs.elektrovojvodina.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aktivnost")
public class Activity {

	@Id
	@Column(name = "id_aktivnosti")
	private int activityID;
	
	@Column(name = "naziv_aktivnosti")
	private String activityName;
	
	@Column(name = "id_sablona")
	public Pattern patternID;
	
	public Activity(){
		
	}

	public Activity(int activityID, String activityName) {
		super();
		this.activityID = activityID;
		this.activityName = activityName;
	}

	public int getActivityID() {
		return activityID;
	}

	public void setActivityID(int activityID) {
		this.activityID = activityID;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Pattern getPatternID() {
		return patternID;
	}

	public void setPatternID(Pattern patternID) {
		this.patternID = patternID;
	}

	@Override
	public String toString() {
		return "activityID=" + activityID + ", activityName=" + activityName;
	}
	
	
}
