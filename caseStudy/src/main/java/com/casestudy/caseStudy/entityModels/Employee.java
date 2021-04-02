package com.casestudy.caseStudy.entityModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employess")
public class Employee {
	//here all the doctor properties that will be saved in the database
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="Emp_ID")
		private Integer empId;
		@Column(name="first_name")
		private String firstName;
		@Column(name="last_name")
		private String lastName;
		@Column(name="occupation")
		private String occupation;
		@Column(name="user_name")
		private String userName;
		@Column(name="password")
		private String password;
		@Column(name = "birthdate")
		private String dateOfBirth;
		@Column(name="gender")
		private String gender;
		@Column(name="street")
		private String street;
		@Column(name="apartement")
		private String apt;
		@Column(name="city")
		private String city;
		@Column(name="state")
		private String state;
		@Column(name="zip_code")
		private Integer zip;
		@Column(name="phone_number")
		private Long phone;
		@Column(name="email")
		private String email;
		@Column(name="picture_name")
		private String fileName;
		@Column(name="picture_path")
		private String filePath;
		@Column(name="picture_type")
		private String fileType;
		@Column(name="picture_size")
		private String fileSize;
		
		//default constructor
		public Employee() {
			super();
		}
		
		//fields constructor
		public Employee(Integer empId, String firstName, String lastName, String occupation, String userName,
				String password, String dateOfBirth, String gender, String street, String apt, String city,
				String state, Integer zip, Long phone, String email, String fileName, String filePath, String fileType,
				String fileSize) {
			super();
			this.empId = empId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.occupation = occupation;
			this.userName = userName;
			this.password = password;
			this.dateOfBirth = dateOfBirth;
			this.gender = gender;
			this.street = street;
			this.apt = apt;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phone = phone;
			this.email = email;
			this.fileName = fileName;
			this.filePath = filePath;
			this.fileType = fileType;
			this.fileSize = fileSize;
		}

		
		
		//getters and setters
		public Integer getEmpId() {
			return empId;
		}

		public void setEmpId(Integer empId) {
			this.empId = empId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getOccupation() {
			return occupation;
		}

		public void setOccupation(String occupation) {
			this.occupation = occupation;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(String dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getApt() {
			return apt;
		}

		public void setApt(String apt) {
			this.apt = apt;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getZip() {
			return zip;
		}

		public void setZip(Integer zip) {
			this.zip = zip;
		}

		public Long getPhone() {
			return phone;
		}

		public void setPhone(Long phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getFilePath() {
			return filePath;
		}

		public void setFilePath(String filePath) {
			this.filePath = filePath;
		}

		public String getFileType() {
			return fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getFileSize() {
			return fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apt == null) ? 0 : apt.hashCode());
			result = prime * result + ((city == null) ? 0 : city.hashCode());
			result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			result = prime * result + ((empId == null) ? 0 : empId.hashCode());
			result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
			result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
			result = prime * result + ((fileSize == null) ? 0 : fileSize.hashCode());
			result = prime * result + ((fileType == null) ? 0 : fileType.hashCode());
			result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
			result = prime * result + ((gender == null) ? 0 : gender.hashCode());
			result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
			result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
			result = prime * result + ((password == null) ? 0 : password.hashCode());
			result = prime * result + ((phone == null) ? 0 : phone.hashCode());
			result = prime * result + ((state == null) ? 0 : state.hashCode());
			result = prime * result + ((street == null) ? 0 : street.hashCode());
			result = prime * result + ((userName == null) ? 0 : userName.hashCode());
			result = prime * result + ((zip == null) ? 0 : zip.hashCode());
			return result;
		}
		
		
		//hash and equals
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			if (apt == null) {
				if (other.apt != null)
					return false;
			} else if (!apt.equals(other.apt))
				return false;
			if (city == null) {
				if (other.city != null)
					return false;
			} else if (!city.equals(other.city))
				return false;
			if (dateOfBirth == null) {
				if (other.dateOfBirth != null)
					return false;
			} else if (!dateOfBirth.equals(other.dateOfBirth))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			if (empId == null) {
				if (other.empId != null)
					return false;
			} else if (!empId.equals(other.empId))
				return false;
			if (fileName == null) {
				if (other.fileName != null)
					return false;
			} else if (!fileName.equals(other.fileName))
				return false;
			if (filePath == null) {
				if (other.filePath != null)
					return false;
			} else if (!filePath.equals(other.filePath))
				return false;
			if (fileSize == null) {
				if (other.fileSize != null)
					return false;
			} else if (!fileSize.equals(other.fileSize))
				return false;
			if (fileType == null) {
				if (other.fileType != null)
					return false;
			} else if (!fileType.equals(other.fileType))
				return false;
			if (firstName == null) {
				if (other.firstName != null)
					return false;
			} else if (!firstName.equals(other.firstName))
				return false;
			if (gender == null) {
				if (other.gender != null)
					return false;
			} else if (!gender.equals(other.gender))
				return false;
			if (lastName == null) {
				if (other.lastName != null)
					return false;
			} else if (!lastName.equals(other.lastName))
				return false;
			if (occupation == null) {
				if (other.occupation != null)
					return false;
			} else if (!occupation.equals(other.occupation))
				return false;
			if (password == null) {
				if (other.password != null)
					return false;
			} else if (!password.equals(other.password))
				return false;
			if (phone == null) {
				if (other.phone != null)
					return false;
			} else if (!phone.equals(other.phone))
				return false;
			if (state == null) {
				if (other.state != null)
					return false;
			} else if (!state.equals(other.state))
				return false;
			if (street == null) {
				if (other.street != null)
					return false;
			} else if (!street.equals(other.street))
				return false;
			if (userName == null) {
				if (other.userName != null)
					return false;
			} else if (!userName.equals(other.userName))
				return false;
			if (zip == null) {
				if (other.zip != null)
					return false;
			} else if (!zip.equals(other.zip))
				return false;
			return true;
		}
		
		
		
		//to string
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", occupation="
					+ occupation + ", userName=" + userName + ", password=" + password + ", dateOfBirth=" + dateOfBirth
					+ ", gender=" + gender + ", street=" + street + ", apt=" + apt + ", city=" + city + ", state="
					+ state + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", fileName=" + fileName
					+ ", filePath=" + filePath + ", fileType=" + fileType + ", fileSize=" + fileSize + "]";
		}
		
		
		
		
		
		
}

