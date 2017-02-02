/**
 * 
 */
package io.hibernate.avinash.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import io.hibernate.avinash.dto.Address;
import io.hibernate.avinash.dto.College;
import io.hibernate.avinash.dto.Student;

/**
 * @author Avinash
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		HibernateTest ht = new HibernateTest();
		College college = new College();
		college.setName("IIT Kgp");
		college.setBoard("Deem");
		ht.save(college);
	}
	void save(College college){
		List<Student>students = new ArrayList<>();
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Student student = new Student();
		student.setFirstName("Avinash");
		student.setRollId(9001);
		student.setSecondName("Singh");
		student.setAddress(new Address("Sarovar Path","Kolkata"));
		System.out.println("I am Testing");
		
		Student student_II = new Student(9002, "Sanchit", "Jain", new Address("Pimple","Pune"));
		Student student_III = new Student(9003, "Aman", "Agrawal", new Address("Pimple","Pune"));
		students.add(student);
		students.add(student_II);
//		students.add(student_III);
		college.setStudents(students);
//		session.save(student);
//		session.save(student_II);
		session.save(college);
		System.out.println("Printing Students :: "+college.getStudents());
		session.getTransaction().commit();
	}

}
