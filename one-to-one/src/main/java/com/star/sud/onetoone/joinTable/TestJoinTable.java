package com.star.sud.onetoone.joinTable;

import org.hibernate.Session;

import com.star.sud.onetoone.util.HibernateConfigUtil;

public class TestJoinTable {

	public static void main(String[] args) {
		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		session.beginTransaction();

		TAccount account = new TAccount();
		account.setAccnNumber("SBI000");
		account.setAccnName("May Bank");
		account.setAccnBranch("KL");
		account.setAccnStatus('A');

		TEmployee employee = new TEmployee();
		employee.setEmpName("Sudarshan");
		employee.setEmpDept("Product Development");
		employee.setEmpAddress("KL, Malaysia");
		employee.setEmpDesign("Software Enginner");

		session.save(account);
		employee.setAccount(account);
		session.save(employee);

		session.getTransaction().commit();
		HibernateConfigUtil.destroy();
	}

}
