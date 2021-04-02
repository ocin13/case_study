package com.casestudy.caseStudy.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.casestudy.caseStudy.entityModels.Doctor;

public interface DoctorRepository extends  JpaRepository<Doctor, Integer>{
//	 @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
//	  User findByEmailAddress(String emailAddress);
}
