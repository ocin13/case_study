package com.casestudy.caseStudy.entityModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue
	@Column(name="apt_id")
	private Integer aptId;
	@Column(name="patient_name")
	private String patientName;
	@Column(name="doctor_name")
	private String doctorName;
	@Column(name="depName_name")
	private String depName;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private Long phone;
	@Column(name="time")
	private String time;
	@Column(name="date")
	private String date;
	@Column(name="note")
	private String message;
	
	//default constructor
	public Appointment() {
		super();
	}
	//constructor using fields
	public Appointment(Integer aptId, String patientName, String doctorName, String depName, String email, Long phone,
			String time, String date,String message) {
		super();
		this.aptId = aptId;
		this.patientName = patientName;
		this.doctorName = doctorName;
		this.depName = depName;
		this.email = email;
		this.phone = phone;
		this.time = time;
		this.date = date;
		this.message = message;
	}
	
	//getters and setters
	public Integer getAptId() {
		return aptId;
	}
	public void setAptId(Integer aptId) {
		this.aptId = aptId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aptId == null) ? 0 : aptId.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((depName == null) ? 0 : depName.hashCode());
		result = prime * result + ((doctorName == null) ? 0 : doctorName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((patientName == null) ? 0 : patientName.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		if (aptId == null) {
			if (other.aptId != null)
				return false;
		} else if (!aptId.equals(other.aptId))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (depName == null) {
			if (other.depName != null)
				return false;
		} else if (!depName.equals(other.depName))
			return false;
		if (doctorName == null) {
			if (other.doctorName != null)
				return false;
		} else if (!doctorName.equals(other.doctorName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (patientName == null) {
			if (other.patientName != null)
				return false;
		} else if (!patientName.equals(other.patientName))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Appointment [aptId=" + aptId + ", patientName=" + patientName + ", doctorName=" + doctorName
				+ ", depName=" + depName + ", email=" + email + ", phone=" + phone + ", time=" + time + ", date=" + date
				+ ", message=" + message + "]";
	}
	
	//generated hash and equals
	
}
