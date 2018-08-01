package com.assertions.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.assertions.example.pojo.Customer;
import com.assertions.example.pojo.Vendor;

public class ManyToOneAssertionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Vendor v1 = new Vendor();
		v1.setVen_name("APPLE");
		v1.setMain_branach("New York");

		Customer c = new Customer();
		c.setCus_id(535);
		c.setCus_name("Stu Watson");
		c.setMobile(987654356);
		c.setPresent_add("London");
		c.setVendordetails(v1);
		session.save(c);
		tx.commit();

		factory.close();

	}

}
