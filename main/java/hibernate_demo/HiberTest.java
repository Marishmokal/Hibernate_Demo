package hibernate_demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberTest {
public static void main(String[] args) {
	
	
	try {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	Address a=new Address(1205,"nagpur");
	
	
	
	Employee e=new Employee(1,"vaibhav",a);
	
	
	Session session=factory.openSession();
	Transaction txn=session.beginTransaction();
	
	
	
	session.save(e);
	txn.commit();
	session.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
	
	
}
