import EmployeeService.Employee;
import PositionService.Position;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Main {
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
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");

    }
}
