package com.star.sud.onetoone.foreignKeyAsso;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity(name = "ForeignKeyAssAccountEntity")
@Table(name = "T_ACCOUNT", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class TAccount implements Serializable {

	// Static Attributes
	/////////////////////
	private static final long serialVersionUID = -6790693372846798580L;

	// Attributes
	////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer accnId;

	@Column(name = "ACCN_NUMBER", unique = true, nullable = false, length = 100)
	private String accnNumber;

	@Column(name = "ACCN_NAME", unique = true, nullable = false, length = 100)
	private String accnName;

	@Column(name = "ACCN_BRANCH", unique = true, nullable = false, length = 100)
	private String accnBranch;

	@Column(name = "ACCN_STATUS", nullable = false, length = 1)
	private char accnStatus;

	@OneToOne(mappedBy = "account")
	private TEmployee employee;

	// Properties
	/////////////////
	/**
	 * @return the employee
	 */
	public TEmployee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(TEmployee employee) {
		this.employee = employee;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the accnNumber
	 */
	public String getAccnNumber() {
		return accnNumber;
	}

	/**
	 * @param accnNumber the accnNumber to set
	 */
	public void setAccnNumber(String accnNumber) {
		this.accnNumber = accnNumber;
	}

	/**
	 * @return the accnName
	 */
	public String getAccnName() {
		return accnName;
	}

	/**
	 * @param accnName the accnName to set
	 */
	public void setAccnName(String accnName) {
		this.accnName = accnName;
	}

	/**
	 * @return the accnBranch
	 */
	public String getAccnBranch() {
		return accnBranch;
	}

	/**
	 * @param accnBranch the accnBranch to set
	 */
	public void setAccnBranch(String accnBranch) {
		this.accnBranch = accnBranch;
	}

	/**
	 * @return the accnStatus
	 */
	public char getAccnStatus() {
		return accnStatus;
	}

	/**
	 * @param accnStatus the accnStatus to set
	 */
	public void setAccnStatus(char accnStatus) {
		this.accnStatus = accnStatus;
	}

	/**
	 * @return the accnId
	 */
	public Integer getAccnId() {
		return accnId;
	}

	/**
	 * @param accnId the accnId to set
	 */
	public void setAccnId(Integer accnId) {
		this.accnId = accnId;
	}

}
