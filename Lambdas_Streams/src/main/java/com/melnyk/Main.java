package com.melnyk;

import com.melnyk.menu.Menu;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu();

    System.out.println("\n///////////////Task1///////////////");
    menu.getTask1(5, 4, 3);

    System.out.println("\n///////////////Task2///////////////");
    menu.getTask2();

    System.out.println("\n///////////////Task3///////////////");
    menu.getTask3();

    System.out.println("\n///////////////Task4///////////////");
    menu.getTask4();
  }
}
