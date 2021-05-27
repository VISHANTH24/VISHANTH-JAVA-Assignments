//DisplayArrayList.java
 
package com.arraylist;
 
import java.util.*;
 
class Employee{
    public int id;
    public String name;
    public int salary;
    public static int count = 0;
 
    //zero argument constructor. Gets called by default when an object is created for the Employee class
    public Employee(){}
 
    //Parameterized Constructor
    public Employee(int id, String name,int salary)
    {
        super();
        this.id = id;
        this.name = name;
        this.salary=salary;
        count++;
    }
 
    public int getId() {
    return id;
    }
 
    public String getName() {
    return name;
    }
 
    public int getSalary() {
    return salary;
    }
}
 
public class DisplayArrayList {
public static void main(String[] args) throws Exception 
    {
     List<Employee> list = new ArrayList<Employee>();
 
     list.add(new Employee(1, "Ram",5000));
     list.add(new Employee(2, "Vinoth",10000));
     list.add(new Employee(3, "Vijay",15000));
     list.add(new Employee(4, "priya",20000));
 
        for (Employee s : list) //Iterates as long as there are elements in the list. An object s is created of type Employee class.
        {
            System.out.print("ID, Name and Salary of the employee are : ");
            System.out.println(s.getId()+" "+s.getName()+" " +s.getSalary());
        }
    }//End of main() method
}//end of DisplayArrayList class