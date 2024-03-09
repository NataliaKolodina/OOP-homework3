// package homework.homework3.iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("Катя");
    list.add("Олег");
    list.add("Саша");
    list.add("Клава");
    list.add("Петя");
    list.add("Аня");
    list.add("Лена");
    list.add("Юра");
    list.add("Кирилл");
    list.add("Наташа");

    for (String elem : list) {
      System.out.println(elem);
    }

    System.out.println("\n ////////////////////////////");

    list.remove(0);
    list.remove(1);

    for (String elem : list) {
      System.out.println(elem);
    }

    System.out.println("\n ////////////////////////////");

    System.out.println(list.get(5));

  }

}
