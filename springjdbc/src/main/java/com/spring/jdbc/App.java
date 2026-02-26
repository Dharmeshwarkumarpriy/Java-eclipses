package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.enties.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("my program started............");
		// spring jdbc=> JdbcTemplalte
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

//		// insert query.....
//		String query = "insert into student(id,name,city) values(?,?,?)";
//
//		// fire query....
//		int result = template.update(query, 42585, "uttam", "bihar");
//		System.out.println("number of record inserted.." + result);

		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		// INSERT....
		Student student=new Student();
		student.setId(5554);
		student.setName("raj kumar");
		student.setCity("tumba");
		
		int result = studentDao.insert(student);
		System.out.println("student added: " + result);
		System.out.println("++++++++++++++");
		
		
//		// UPDATE....
//		Student student=new Student();
//		student.setId(434);
//		student.setName("raj kumar");
//		student.setCity("tumba");
//		int result = studentDao.change(student);
//		System.out.println("data changed: "+result);

		
		// DELETE....
		int resultD = studentDao.delete(4554);
		System.out.println("deleted: "+resultD);
		System.out.println("++++++++++++++");
		
		
		// SELECT SINGLE OBJECT....	
		Student student1 = studentDao.getStudent(458);
		System.out.println("single object: "+student1);
		System.out.println("++++++++++++++");
		
		
		// SELECT MULTIPLE OBJECT...
		List<Student> students = studentDao.getAllStudents();
		for(Student s:students) {
			System.out.println("multiple object: "+s);
		}
	}
}
