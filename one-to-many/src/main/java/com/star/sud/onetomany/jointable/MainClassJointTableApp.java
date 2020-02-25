/**
 * 
 */
package com.star.sud.onetomany.jointable;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.star.sud.onetomany.util.HibernateConfigUtil;

/**
 * @author Sudarshan
 *
 */
public class MainClassJointTableApp {

	public static void main(String[] args) {

		Session session = HibernateConfigUtil.getSessionFactory().openSession();
		session.beginTransaction();

		TOrder tOrder1 = new TOrder();
		tOrder1.setOrdGrosPrice(100.00);
		tOrder1.setOrdQty(5.0);
		tOrder1.setOrdNumber(String.valueOf(System.nanoTime()));

		TOrder tOrder2 = new TOrder();
		tOrder2.setOrdGrosPrice(200.00);
		tOrder2.setOrdQty(10.0);
		tOrder2.setOrdNumber(String.valueOf(System.nanoTime()));

		Set<TOrder> orders = new HashSet<TOrder>();
		orders.add(tOrder1);
		orders.add(tOrder2);

		// Persist the object - TCustomer
		TCustomer customer = new TCustomer();
		customer.setCustName("Sudarshan");
		customer.setCustEmail("sudarshan@gmail.com");
		customer.setCustAddress("Bangalore, India");
		customer.setOrders(orders);

		session.save(customer);

		session.getTransaction().commit();
		HibernateConfigUtil.destroy();

	}
}
