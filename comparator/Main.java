// package homework.homework3.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Employee> list = new ArrayList<>();
    list.add(new Employee("Андрей", 25, 5500));
    list.add(new Employee("Ольга", 55, 75000));
    list.add(new Employee("Евгений", 31, 250000));
    list.add(new Employee("Александра", 43, 53800));
    list.add(new Employee("Григорий", 20, 18000));

    System.out.println("Список работников до сортировки:");
    for (Employee worker : list) {
      System.out.println(worker);
    }

    System.out.println("\n////////////////////////////////");

    Collections.sort(list);

    System.out.println("\nСписок работников после сортировки по возрасту:");
    for (Employee worker : list) {
      System.out.println(worker);
    }

    System.out.println("\n////////////////////////////////");

    Collections.sort(list, new SalaryComparator());

    System.out.println("\nСписок работников после сортировки по зарплате:");
    for (Employee worker : list) {
      System.out.println(worker);
    }
  }
}
