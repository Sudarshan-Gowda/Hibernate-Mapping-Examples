/**
 * 
 */
package com.star.sud.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.star.sud.manytomany.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassApp {

	public static void main(String[] args) {

		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Add Subject
		TSubject subjectOne = new TSubject();
		subjectOne.setSubName("English");
		subjectOne.setSubClass("10");

		TSubject subjectTwo = new TSubject();
		subjectTwo.setSubName("Kannada");
		subjectTwo.setSubClass("10");

		Set<TSubject> tSubjects = new HashSet<TSubject>();
		tSubjects.add(subjectOne);
		tSubjects.add(subjectTwo);

		// Add Student
		TStudent studentOne = new TStudent();
		studentOne.setStdName("John");
		studentOne.setStdEmail("john@gmail.com");
		studentOne.setStdClass("10");

		TStudent studentTwo = new TStudent();
		studentTwo.setStdName("Amy");
		studentTwo.setStdEmail("amy@gmail.com");
		studentTwo.setStdClass("10");

		Set<TStudent> tStudents = new HashSet<TStudent>();
		tStudents.add(studentOne);
		tStudents.add(studentTwo);

		studentOne.setSubjects(tSubjects);
		studentTwo.setSubjects(tSubjects);

		session.save(studentOne);
		session.save(studentTwo);

		session.getTransaction().commit();

		HibernateConfigUtil.destroy();
	}

}
