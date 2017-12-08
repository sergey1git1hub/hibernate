package hibernate;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		user.setAddress("First user address.");
		user.setDescription("First user description.");
		user.setJoinedDate(new Date());
	
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		user = null;

		//sessionFactory = new Configuration().configure().buildSessionFactory(); this fucking line of code drops my table
		session = sessionFactory.openSession();
		// object that we need and data that we need
		user = (UserDetails)session.get(UserDetails.class, 1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User Name retrieved is " + user.getUserName());
		
	}

}
