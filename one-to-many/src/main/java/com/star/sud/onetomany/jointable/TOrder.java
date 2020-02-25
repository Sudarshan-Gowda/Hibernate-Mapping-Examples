/**
 * 
 */
package com.star.sud.onetomany.jointable;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "T_ORDER", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class TOrder implements Serializable {

	// Static Attributes
	/////////////////////
	private static final long serialVersionUID = 6639125923104280986L;

	// Attributes
	////////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer ordId;

	@Column(name = "ORD_NUMBER", unique = true, nullable = false, length = 100)
	private String ordNumber;

	@Column(name = "ORD_QTY", nullable = false, length = 100)
	private Double ordQty;

	@Column(name = "ORD_GROS_PRICE", nullable = false, length = 100)
	private Double ordGrosPrice;

	/**
	 * @return the ordNumber
	 */
	public String getOrdNumber() {
		return ordNumber;
	}

	/**
	 * @param ordNumber the ordNumber to set
	 */
	public void setOrdNumber(String ordNumber) {
		this.ordNumber = ordNumber;
	}

	/**
	 * @return the ordQty
	 */
	public Double getOrdQty() {
		return ordQty;
	}

	/**
	 * @param ordQty the ordQty to set
	 */
	public void setOrdQty(Double ordQty) {
		this.ordQty = ordQty;
	}

	/**
	 * @return the ordGrosPrice
	 */
	public Double getOrdGrosPrice() {
		return ordGrosPrice;
	}

	/**
	 * @param ordGrosPrice the ordGrosPrice to set
	 */
	public void setOrdGrosPrice(Double ordGrosPrice) {
		this.ordGrosPrice = ordGrosPrice;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the ordId
	 */
	public Integer getOrdId() {
		return ordId;
	}

	/**
	 * @param ordId the ordId to set
	 */
	public void setOrdId(Integer ordId) {
		this.ordId = ordId;
	}

}
