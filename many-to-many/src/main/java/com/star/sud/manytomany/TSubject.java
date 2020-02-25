/**
 * 
 */
package com.star.sud.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "SUBJECT", uniqueConstraints = { @UniqueConstraint(columnNames = "ID") })
public class TSubject implements Serializable {

	private static final long serialVersionUID = 815120191262055909L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer subId;

	@Column(name = "NAME", nullable = false, length = 100)
	private String subName;

	@Column(name = "CLASS", nullable = false, length = 100)
	private String subClass;

	@ManyToMany(mappedBy = "subjects")
	private Set<TStudent> students;

	/**
	 * @return the subId
	 */
	public Integer getSubId() {
		return subId;
	}

	/**
	 * @param subId the subId to set
	 */
	public void setSubId(Integer subId) {
		this.subId = subId;
	}

	/**
	 * @return the subName
	 */
	public String getSubName() {
		return subName;
	}

	/**
	 * @param subName the subName to set
	 */
	public void setSubName(String subName) {
		this.subName = subName;
	}

	/**
	 * @return the subClass
	 */
	public String getSubClass() {
		return subClass;
	}

	/**
	 * @param subClass the subClass to set
	 */
	public void setSubClass(String subClass) {
		this.subClass = subClass;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the students
	 */
	public Set<TStudent> getStudents() {
		return students;
	}

	/**
	 * @param students the students to set
	 */
	public void setStudents(Set<TStudent> students) {
		this.students = students;
	}

}
