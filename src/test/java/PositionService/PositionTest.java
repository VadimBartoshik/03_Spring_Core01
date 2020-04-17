package PositionService;

import EmployeeService.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PositionTest {

    @org.junit.Test
    public void isNullPosition() {
        Position director = new Position("директор", 1000, 1, new ArrayList<Employee>());
        Employee vadim = new Employee("Вадим", 18);
        boolean actual=director.isNullPosition(vadim);
        boolean expected= false;
        assertEquals(expected,actual);
    }


    @Test
    public void fireEmployee() {
        Position worker = new Position("работник", 700, 3, new ArrayList<Employee>());
        Employee vadim = new Employee("Вадим", 18);
        Employee ivan = new Employee("Иван", 18, worker);
        Employee marina = new Employee("Марина", 18, worker);
        List<Employee> actualList=worker.getEmployeeList();
        worker.fireEmployee(ivan);
        List<Employee> expectedList= Arrays.asList(marina);
        assertEquals(expectedList,actualList);
    }



    @Test
    public void hireEmployee() {
        Position worker = new Position("работник", 700, 3, new ArrayList<Employee>());
        Employee vadim = new Employee("Вадим", 18);
        Employee ivan = new Employee("Иван", 18, worker);
        worker.hireEmployee(vadim);
        List<Employee> actualList=worker.getEmployeeList();
        List<Employee> expectedList= Arrays.asList(ivan,vadim);
        assertEquals(expectedList,actualList);
    }
}