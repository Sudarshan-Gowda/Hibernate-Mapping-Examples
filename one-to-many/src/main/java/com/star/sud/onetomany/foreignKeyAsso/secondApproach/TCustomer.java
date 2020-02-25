/**
 * 
 */
package com.star.sud.onetomany.foreignKeyAsso.secondApproach;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_CUSTOMER", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "CUST_EMAIL") })
public class TCustomer implements Serializable {

	// Static Attributes
	/////////////////////
	private static final long serialVersionUID = 988212065554669970L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer custId;

	@Column(name = "CUST_NAME", unique = false, nullable = false, length = 100)
	private String custName;

	@Column(name = "CUST_EMAIL", unique = true, nullable = false, length = 100)
	private String custEmail;

	@Column(name = "CUST_ADDRESS", nullable = false, length = 250)
	private String custAddress;

	@OneToMany(mappedBy = "customer")
	private Set<TOrder> orders;

	/**
	 * @return the custId
	 */
	public Integer getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * @return the custEmail
	 */
	public String getCustEmail() {
		return custEmail;
	}

	/**
	 * @param custEmail the custEmail to set
	 */
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}

	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	/**
	 * @return the orders
	 */
	public Set<TOrder> getOrders() {
		return orders;
	}

	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Set<TOrder> orders) {
		this.orders = orders;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
