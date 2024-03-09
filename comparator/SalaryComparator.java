package homework.homework3.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
  @Override
  public int compare(Employee worker1, Employee worker2) {
    if (worker1.getSalary() > worker2.getSalary())
      return 1;
    if (worker1.getSalary() < worker2.getSalary())
      return -1;
    else
      return 0;
  }
}
