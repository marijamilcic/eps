package rs.elektrovojvodina.api.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "radnik")
public class Worker {

	@Id
	@Column(name= "id_radnika")
	public int workerID;
	
	@Column(name = "jmbg")
	public int idNumber;
	
	@Column(name= "strucnost")
	public String professionalism;
	
	@Column(name= "status")
	public String status;
	
	@Column(name= "ime")
	public String name;
	
	@Column(name= "prezime")
	public String surname;
	
	public Worker(){
		
	}

	public Worker(int workerID, int idNumber, String professionalism, String status, String name, String surname) {
		super();
		this.workerID = workerID;
		this.idNumber = idNumber;
		this.professionalism = professionalism;
		this.status = status;
		this.name = name;
		this.surname = surname;
	}



	public int getWorkerID() {
		return workerID;
	}

	public void setWorkerID(int workerID) {
		this.workerID = workerID;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getProfessionalism() {
		return professionalism;
	}

	public void setProfessionalism(String professionalism) {
		this.professionalism = professionalism;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "workerID=" + workerID + ", idNumber=" + idNumber + ", professionalism=" + professionalism
				+ ", status=" + status + ", name=" + name + ", surname=" + surname;
	}
	
	
}
