package com.assertions.example;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.assertions.example.pojo.Comments;
import com.assertions.example.pojo.Post;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Comments c = new Comments();
		c.setCommented_by("Stu watson");

		Comments c1 = new Comments();
		c1.setCommented_by("Arpit Jain");

		Set<Comments> s1 = new HashSet<Comments>();
		s1.add(c);
		s1.add(c1);

		Post p = new Post();
		p.setPost_type("Image");
		p.setTime("08:41 2018");
		p.setDay("Tuesday");
		p.setCommentdetails(s1);

		session.save(p);

		tx.commit();
		session.close();
		factory.close();

	}
}
