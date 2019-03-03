package com.melnyk.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task4 {

  private List<String> stringList= new ArrayList<>();

  public void getTask4() {
    System.out.println("Enter some number of text lines:");
    Scanner scanner = new Scanner(System.in);
    String s;
    for (;;){
      s = scanner.nextLine();
      if (s.isEmpty()) {
        break;
      }
      stringList.add(s);
    }
    task4();
  }

  private void task4() {
    System.out.println("Number of unique words: "
        + stringList.stream().distinct().count());

    System.out.println("Sorted list of all unique words:");
    stringList.stream().distinct()
        .sorted().forEach(x -> System.out.print(x + " "));

    System.out.println("\nWord count. Occurrence number of each word in the text:");
    System.out.println(stringList.stream()
        .collect(Collectors.groupingBy(x -> x, Collectors.counting())));

    System.out.println("Occurrence number of each symbol except upper case characters:");
    System.out.println(stringList.stream()
        .flatMap(x -> x.chars().boxed()).map(x -> (char) x.intValue())
        .collect(Collectors.groupingBy(x -> x, Collectors.counting())));
  }
}
