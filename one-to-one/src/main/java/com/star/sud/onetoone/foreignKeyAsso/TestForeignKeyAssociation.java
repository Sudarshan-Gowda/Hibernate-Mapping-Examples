package com.star.sud.onetoone.foreignKeyAsso;

import org.hibernate.Session;

import com.star.sud.onetoone.util.HibernateConfigUtil;

public class TestForeignKeyAssociation {

	public static void main(String[] args) {
		try {
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

			// Save Account
			session.saveOrUpdate(account);
			// Save Employee
			employee.setAccount(account);
			session.saveOrUpdate(employee);

			session.getTransaction().commit();
			HibernateConfigUtil.destroy();

		} catch (Exception e) {
			System.out.println("Eror is :" + e);
		}
	}

}
