package com.star.sud.onetoone.foreignKeyAsso;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Sudarshan
 *
 */
@Entity(name = "ForeignKeyAssEmployeeEntity")
@Table(name = "T_EMPLOYEE", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class TEmployee implements Serializable {

	// Static Attributes
	/////////////////////
	private static final long serialVersionUID = -1798070786993154676L;

	// Attributes
	////////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer empId;

	@Column(name = "EMP_NAME", unique = false, nullable = false, length = 100)
	private String empName;

	@Column(name = "EMP_DESIGN", unique = false, nullable = false, length = 100)
	private String empDesign;

	@Column(name = "EMP_DEPT", unique = false, nullable = false, length = 100)
	private String empDept;

	@Column(name = "EMP_ADDRESS", unique = true, nullable = false, length = 100)
	private String empAddress;

	@OneToOne
	@JoinColumn(name = "EMP_ACCN_ID")
	private TAccount account;

	/**
	 * @return the account
	 */
	public TAccount getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(TAccount account) {
		this.account = account;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empDesign
	 */
	public String getEmpDesign() {
		return empDesign;
	}

	/**
	 * @param empDesign the empDesign to set
	 */
	public void setEmpDesign(String empDesign) {
		this.empDesign = empDesign;
	}

	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}

	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

}
