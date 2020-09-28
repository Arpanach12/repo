package com.mindtree.DocVallidationService.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity

public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne(cascade = CascadeType.ALL)
	private UserDetails userDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private AccountType accountType;
	@OneToOne(cascade = CascadeType.ALL)
    private Branch branch;
	@OneToOne(cascade = CascadeType.ALL)
	private Occupation occupation;
	@OneToOne(cascade = CascadeType.ALL)
	private Education education;
	@OneToOne(cascade = CascadeType.ALL)
	private Income income;
	@OneToOne(cascade = CascadeType.ALL)
	private ResidentialStatus residentialStatus;
	@OneToOne(cascade = CascadeType.ALL)
	private Gender gender;
	@OneToOne(cascade = CascadeType.ALL)
	private MaritalStatus maritalStatus;

	public Registration() {
		super();
	}

	public Registration(int id, UserDetails userDetails, Branch branch, AccountType accountType, Occupation occupation,
			Education education, Income income, ResidentialStatus residentialStatus, Gender gender,
			MaritalStatus maritalStatus) {
		super();
		this.id = id;
		this.userDetails = userDetails;
		this.branch = branch;
		this.accountType = accountType;
		this.occupation = occupation;
		this.education = education;
		this.income = income;
		this.residentialStatus = residentialStatus;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Occupation getOccupation() {
		return occupation;
	}

	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}

	public Education getEducation() {
		return education;
	}

	public void setEducation(Education education) {
		this.education = education;
	}

	public Income getIncome() {
		return income;
	}

	public void setIncome(Income income) {
		this.income = income;
	}

	public ResidentialStatus getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(ResidentialStatus residentialStatus) {
		this.residentialStatus = residentialStatus;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	

	@Override
	public String toString() {
		return "Registration [id=" + id + ", userDetails=" + userDetails + ", branch=" + branch + ", accountType="
				+ accountType + ", occupation=" + occupation + ", education=" + education + ", income=" + income
				+ ", residentialStatus=" + residentialStatus + ", gender=" + gender + ", maritalStatus=" + maritalStatus
				+  "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountType == null) ? 0 : accountType.hashCode());
		result = prime * result + ((branch == null) ? 0 : branch.hashCode());
		result = prime * result + ((education == null) ? 0 : education.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + id;
		result = prime * result + ((income == null) ? 0 : income.hashCode());
		result = prime * result + ((maritalStatus == null) ? 0 : maritalStatus.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((residentialStatus == null) ? 0 : residentialStatus.hashCode());
		result = prime * result + ((userDetails == null) ? 0 : userDetails.hashCode());
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
		Registration other = (Registration) obj;
		if (accountType == null) {
			if (other.accountType != null)
				return false;
		} else if (!accountType.equals(other.accountType))
			return false;
		if (branch == null) {
			if (other.branch != null)
				return false;
		} else if (!branch.equals(other.branch))
			return false;
		if (education == null) {
			if (other.education != null)
				return false;
		} else if (!education.equals(other.education))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (income == null) {
			if (other.income != null)
				return false;
		} else if (!income.equals(other.income))
			return false;
		if (maritalStatus == null) {
			if (other.maritalStatus != null)
				return false;
		} else if (!maritalStatus.equals(other.maritalStatus))
			return false;
		if (occupation == null) {
			if (other.occupation != null)
				return false;
		} else if (!occupation.equals(other.occupation))
			return false;
		
		if (residentialStatus == null) {
			if (other.residentialStatus != null)
				return false;
		} else if (!residentialStatus.equals(other.residentialStatus))
			return false;
		if (userDetails == null) {
			if (other.userDetails != null)
				return false;
		} else if (!userDetails.equals(other.userDetails))
			return false;
		return true;
	}

}


