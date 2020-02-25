/**
 * 
 */
package com.star.sud.onetomany.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author Sudarshan
 *
 */
public class HibernateConfigUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			Configuration config = new Configuration().configure("hibernate.cfg.xml");
			StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(config.getProperties()).build();
			SessionFactory sessionFactory = config.buildSessionFactory(serviceRegistry);
			return sessionFactory;

		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static void destroy() {
		getSessionFactory().close();
	}

}
