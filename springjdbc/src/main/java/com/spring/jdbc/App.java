package com.spring.jdbc;

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
//		// INSERT....
		Student student=new Student();
//		student.setId(5656);
//		student.setName("priye");
//		student.setCity("rohtas");
//		
//		int result = studentDao.insert(student);
//		System.out.println("student added:" + result);
		
//		// UPDATE....
//		Student student=new Student();
//		student.setId(434);
//		student.setName("raj kumar");
//		student.setCity("tumba");
//		int result = studentDao.change(student);
//		System.out.println("data changed: "+result);
//		
		// DELETE....
		int result = studentDao.delete(45);
		System.out.println("deleted: "+result);
		
	}
}
