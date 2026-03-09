package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//    	Student student=new Student(222,"dharmy","delhi");
//    	int r = studentDao.insert(student);
//    	System.out.println("done: "+r);
//    	
    	
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	
    	boolean go= true;
    	while (go) {
    		System.out.println("Press 1: add new student");
        	System.out.println("Press 2: display all student");
        	System.out.println("Press 3: get detail of single student");
        	System.out.println("Press 4: delete student");
        	System.out.println("Press 5: update student");
        	System.out.println("Press 6: exit");
        
        	try {
				
        		int input = Integer.parseInt(br.readLine());
        	    switch (input) {
				case 1:
					// add a new student...
					// taking inputs form users...
					System.out.print("for add-");
					System.out.println("enter user id: ");
					int uid=Integer.parseInt(br.readLine());
					
					System.out.println("enter user name :");
					String uName=br.readLine();
					
					System.out.println("enter user city :");
					String uCity = br.readLine();
					
					// creating student object and setting values....
					Student s=new Student();
					s.setStudentId(uid);
					s.setStudentName(uName);
					s.setStudentCity(uCity);
					
					// saving student object to database by calling insert of student dao...
					int r = studentDao.insert(s);
					System.out.println(r+ " sudent add");
					System.out.println("++++++++++++++++");
					System.out.println();
					break;
				case 2:
					// display add student...
					System.out.print("for all view-");
					List<Student> allStudents = studentDao.getAllStudents();
					for(Student st:allStudents) {
						System.out.println("id :"+st.getStudentId());
						System.out.println("name :"+st.getStudentName());
						System.out.println("city :"+st.getStudentCity());
						System.out.println("+++++++++++++++++++++++");
						
					}
					System.out.println("_____________________");
					break;
				case 3:
					// single student data....
					System.out.print("for single view-");
					System.out.println("enter user id: ");
					int userid=Integer.parseInt(br.readLine());
					Student student = studentDao.geStudent(userid);
					System.out.println("id :"+student.getStudentId());
					System.out.println("name :"+student.getStudentName());
					System.out.println("city :"+student.getStudentCity());
					System.out.println("+++++++++++++++++++++++");
					break;
				case 4:
					// delete students...
					System.out.print("for delete-");
					System.out.println("enter user id: ");
					int id=Integer.parseInt(br.readLine());
					studentDao.deleteStudent(id);
					System.out.println("student deleted...");
					System.out.println("+++++++++++++++++++++++");
					
					break;
				case 5:
					// update student...
					System.out.print("for update-");
					System.out.println("enter user id: ");
					int uduserid=Integer.parseInt(br.readLine());
					Student student1 = studentDao.geStudent(uduserid);
					
					System.out.println("enter user name :"+student1.getStudentName());
					String upName=br.readLine();
					
					System.out.println("enter user city :"+student1.getStudentCity());
					String upCity = br.readLine();
					
					// creating student object and setting values....
					Student s1=new Student();
					
					student1.setStudentName(upName);
					student1.setStudentCity(upCity);
					
					// saving student object to database by calling insert of student dao...
					studentDao.updateStudent(student1);
					System.out.println(student1+ " sudent update");
					
					
					System.out.println("student updated...");
					System.out.println("+++++++++++++++++++++++");
					
					break;
				case 6:
					// exit...
					go=false;
					break;
				}
        		
        		
			} catch (Exception e) {
				System.out.println("Invalid input try with another one.");
				System.out.println(e.getMessage());
			}
		}
    	  System.out.println("thankyou for using my application.");
    	  System.out.println("have a nice day.");
    	  System.out.println("see you soon..");
    }
}
