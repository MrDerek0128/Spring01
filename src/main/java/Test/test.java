package Test;

import bean.Car;
import bean.CarFactor;
import bean.Person;
import bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Student student = (Student) applicationContext.getBean("stu");
        System.out.println(student);
        Student student2 = (Student) applicationContext.getBean("stu2");
        System.out.println(student2);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
