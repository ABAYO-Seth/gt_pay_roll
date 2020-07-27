package rw.co.gtbank.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalaryDetails {
	@Id
	private String id;
	private Double basicSalary;
	private Double transport;
	private Double fuel;
	private String acountNumber;
	private Double insurance;
	private Double housing;
	private Double reper_fees;
	private Double bonuses;
	private Double cashiers;
	private Double brd_fees;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(Double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Double getTransport() {
		return transport;
	}
	public void setTransport(Double transport) {
		this.transport = transport;
	}
	public Double getFuel() {
		return fuel;
	}
	public void setFuel(Double fuel) {
		this.fuel = fuel;
	}
	public String getAcountNumber() {
		return acountNumber;
	}
	public void setAcountNumber(String acountNumber) {
		this.acountNumber = acountNumber;
	}
	public Double getInsurance() {
		return insurance;
	}
	public void setInsurance(Double insurance) {
		this.insurance = insurance;
	}
	public Double getHousing() {
		return housing;
	}
	public void setHousing(Double housing) {
		this.housing = housing;
	}
	public Double getReper_fees() {
		return reper_fees;
	}
	public void setReper_fees(Double reper_fees) {
		this.reper_fees = reper_fees;
	}
	public Double getBonuses() {
		return bonuses;
	}
	public void setBonuses(Double bonuses) {
		this.bonuses = bonuses;
	}
	public Double getCashiers() {
		return cashiers;
	}
	public void setCashiers(Double cashiers) {
		this.cashiers = cashiers;
	}
	public Double getBrd_fees() {
		return brd_fees;
	}
	public void setBrd_fees(Double brd_fees) {
		this.brd_fees = brd_fees;
	}
	
	
	

}
