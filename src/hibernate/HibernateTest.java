package hibernate;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import dto.Address;
import dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address();
		Address address2 = new Address();
		address.setCity("city");
		address.setPincode("pincode");
		address.setState("state");
		address.setStreet("street");
		
		address2.setCity("city2");
		address2.setPincode("pincode2");
		address2.setState("state2");
		address2.setStreet("street2");
		UserDetails user = new UserDetails();
		UserDetails user2 = new UserDetails();
		user.setUserId(1);
		user.setUserName("First User");
		user.setAddress(address);
		user2.setUserName("Second User");
		user2.setAddress(address2);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(user2);
		session.getTransaction().commit();
		session.close();
		
	}

}
