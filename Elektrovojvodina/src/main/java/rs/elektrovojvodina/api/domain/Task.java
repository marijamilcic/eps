package rs.elektrovojvodina.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "korak")
public class Task {

	@Id
	@Column(name= "id_koraka")
	private int taskID;
	
	@Column(name= "naziv_koraka")
	private String taskName;
	
	@Column(name= "id_aktivnosti")
	private Activity activityID;
	
	public Task(){
		
	}

	public Task(int taskID, String taskName, Activity activityID) {
		super();
		this.taskID = taskID;
		this.taskName = taskName;
		this.activityID = activityID;
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Activity getActivityID() {
		return activityID;
	}

	public void setActivityID(Activity activityID) {
		this.activityID = activityID;
	}

	@Override
	public String toString() {
		return "taskID=" + taskID + ", taskName=" + taskName + ", activityID=" + activityID;
	}
	
	
}
