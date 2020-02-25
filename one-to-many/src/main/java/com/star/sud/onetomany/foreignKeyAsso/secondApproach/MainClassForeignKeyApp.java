/**
 * 
 */
package com.star.sud.onetomany.foreignKeyAsso.secondApproach;

import org.hibernate.Session;

import com.star.sud.onetomany.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassForeignKeyApp {

	public static void main(String[] args) {

		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		session.beginTransaction();

		// Persist the object - TCustomer
		TCustomer firstCustomer = new TCustomer();
		firstCustomer.setCustName("Sudarshan");
		firstCustomer.setCustEmail("sudarshan@gmail.com");
		firstCustomer.setCustAddress("Bangalore, India");

		TCustomer secondCustomer = new TCustomer();
		secondCustomer.setCustName("John");
		secondCustomer.setCustEmail("john@gmail.com");
		secondCustomer.setCustAddress("US, USA");

		session.save(firstCustomer);
		session.save(secondCustomer);

		TOrder tOrder1 = new TOrder();
		tOrder1.setOrdGrosPrice(100.00);
		tOrder1.setOrdQty(5.0);
		tOrder1.setOrdNumber(String.valueOf(System.nanoTime()));
		tOrder1.setCustomer(firstCustomer);

		TOrder tOrder2 = new TOrder();
		tOrder2.setOrdGrosPrice(200.00);
		tOrder2.setOrdQty(10.0);
		tOrder2.setOrdNumber(String.valueOf(System.nanoTime()));
		tOrder2.setCustomer(firstCustomer);

		TOrder tOrder3 = new TOrder();
		tOrder3.setOrdGrosPrice(300.00);
		tOrder3.setOrdQty(30.0);
		tOrder3.setOrdNumber(String.valueOf(System.nanoTime()));
		tOrder3.setCustomer(secondCustomer);

		session.save(tOrder1);
		session.save(tOrder2);
		session.save(tOrder3);

		session.getTransaction().commit();

		HibernateConfigUtil.destroy();

	}

}
