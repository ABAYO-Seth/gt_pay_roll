package rw.co.gtbank.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import rw.co.gtbank.domain.enums.*;


@Entity
public class Employee {
	@Id
	private String staff_id_no;
	private Long nationalId;
	private String firstName;
	private String lastName;
	private String rssb_number;
	private String educational_level;
	private Date dob;
	private Date employment_date;
	private String specialization;
	@Enumerated(EnumType.STRING)
	private JobTitle jobTitle;
	@Enumerated(EnumType.STRING)
	private Grade grade;
	@Enumerated(EnumType.STRING)
	private Nationality nationality;
	@Enumerated(EnumType.STRING)
	private Branch branch;
	@Enumerated(EnumType.STRING)
	private Type_of_Contract type_of_contract;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	public String getStaff_id_no() {
		return staff_id_no;
	}
	public void setStaff_id_no(String staff_id_no) {
		this.staff_id_no = staff_id_no;
	}
	public Long getNationalId() {
		return nationalId;
	}
	public void setNationalId(Long nationalId) {
		this.nationalId = nationalId;
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
	public String getRssb_number() {
		return rssb_number;
	}
	public void setRssb_number(String rssb_number) {
		this.rssb_number = rssb_number;
	}
	public String getEducational_level() {
		return educational_level;
	}
	public void setEducational_level(String educational_level) {
		this.educational_level = educational_level;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getEmployment_date() {
		return employment_date;
	}
	public void setEmployment_date(Date employment_date) {
		this.employment_date = employment_date;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public JobTitle getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public Nationality getNationality() {
		return nationality;
	}
	public void setNationality(Nationality nationality) {
		this.nationality = nationality;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public Type_of_Contract getType_of_contract() {
		return type_of_contract;
	}
	public void setType_of_contract(Type_of_Contract type_of_contract) {
		this.type_of_contract = type_of_contract;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
	

}
