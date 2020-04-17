package Runner;

import positionService.Position;
import employeeService.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main(String[] args) {
        //        Position director = new Position("директор", 1000, 1, new ArrayList<Employee>());
//        Position working = new Position("работник", 700, 3, new ArrayList<Employee>());
//
//        Employee vadim = new Employee("Вадим", 18);
//        Employee ivan = new Employee("Иван", 18, working);
//        Employee marina = new Employee("Марина", 18, working);

        //   Employee kirill = new Employee("Кирилл", 20, director);
        //    working.hireEmployee(kirill);

        //   System.out.println(vadim.getPosition());
//        director.hireEmployee(marina);
//        working.hireEmployee(marina);
//        director.hireEmployee(vadim);
//        director.printEmployeeList();
//        working.printEmployeeList();
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        Position worker = (Position) context.getBean("worker");
        Position director = (Position) context.getBean("director");
        Position secretary= (Position)context.getBean("secretary");

        Employee vadim = (Employee) context.getBean("vadim");
        Employee ivan = (Employee) context.getBean("ivan");
        Employee marina = (Employee) context.getBean("marina");
        Employee dasha = (Employee) context.getBean("dasha");
        Employee anna = (Employee) context.getBean("anna");
        Employee alex = (Employee) context.getBean("alex");

        System.out.println(worker.toString());
        System.out.println(director.toString());
        System.out.println(secretary.toString());
        System.out.println("********************");
        System.out.println(vadim.toString());
        System.out.println(ivan.toString());
        System.out.println(marina.toString());
        System.out.println(dasha.toString());
        System.out.println(anna.toString());
        System.out.println(alex.toString());
//        System.out.println(vadim.toString());
//        System.out.println(worker.toString());
//        worker.printEmployeeList();
    }
}
