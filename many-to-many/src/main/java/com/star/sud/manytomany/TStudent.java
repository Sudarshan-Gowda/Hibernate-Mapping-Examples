/**
 * 
 */
package com.star.sud.manytomany;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * @author Sudarshan
 *
 */
@Entity
@Table(name = "STUDENT", uniqueConstraints = { @UniqueConstraint(columnNames = "ID"),
		@UniqueConstraint(columnNames = "EMAIL") })
public class TStudent implements Serializable {

	private static final long serialVersionUID = -2299246075162376775L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME", unique = false, nullable = false, length = 100)
	private String stdName;

	@Column(name = "CLASS", unique = false, nullable = false, length = 100)
	private String stdClass;

	@Column(name = "EMAIL", unique = false, nullable = false, length = 100)
	private String stdEmail;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_SUBJECT", joinColumns = {
			@JoinColumn(referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "ID") })
	private Set<TSubject> subjects;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the stdName
	 */
	public String getStdName() {
		return stdName;
	}

	/**
	 * @param stdName the stdName to set
	 */
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	/**
	 * @return the stdClass
	 */
	public String getStdClass() {
		return stdClass;
	}

	/**
	 * @param stdClass the stdClass to set
	 */
	public void setStdClass(String stdClass) {
		this.stdClass = stdClass;
	}

	/**
	 * @return the stdEmail
	 */
	public String getStdEmail() {
		return stdEmail;
	}

	/**
	 * @param stdEmail the stdEmail to set
	 */
	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the subjects
	 */
	public Set<TSubject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(Set<TSubject> subjects) {
		this.subjects = subjects;
	}

}
