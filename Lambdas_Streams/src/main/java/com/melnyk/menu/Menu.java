package com.melnyk.menu;

import com.melnyk.tasks.Task1;
import com.melnyk.tasks.Task2;
import com.melnyk.tasks.Task3;
import com.melnyk.tasks.Task4;

public class Menu {

  public void getTask1(int n1, int n2, int n3) {
    new Task1().getTask1(n1, n2, n3);
  }

  public void getTask2() {
    new Task2().getTask2();
  }

  public void getTask3() {
    new Task3().getTask3();
  }

  public void getTask4() {
    new Task4().getTask4();
  }
}
