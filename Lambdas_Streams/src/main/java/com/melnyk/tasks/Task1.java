package com.melnyk.tasks;

public class Task1 {

  public void getTask1(int n1, int n2, int n3) {
    MyFunctionalInterface average = (a, b, c) -> (a + b + c) / 3;
    MyFunctionalInterface max = (a, b, c) -> {
      if (a >= b && a >= c) {
        return a;
      } else if (b >= a && b >= c) {
        return b;
      }
      return c;
    };
    System.out.println("Max of those numbers: " + max.execute(n1, n2, n3));
    System.out.println("Average of those numbers: " + average.execute(n1, n2, n3));
  }
}