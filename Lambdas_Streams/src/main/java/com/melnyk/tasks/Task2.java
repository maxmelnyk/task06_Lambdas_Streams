package com.melnyk.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2 implements Command {

  private Map<String, Command> task2() {
    Map<String, Command> commands = new HashMap<>();

    commands.put("asLambdaFunction", (message) -> System.out.println("As lambda function. " + message));
    commands.put("asMethodReference", Task2::asMethodReference);
    commands.put("asAnonymousClass", new Command() {
      @Override
      public void execute(String message) {
        System.out.println("As anonymous class. " + message);
      }
    });
    commands.put("asObjectOfCommandClass", new Task2());

    return commands;
  }

  private static void asMethodReference(String message) {
    System.out.println("As method reference. " + message);
  }

  @Override
  public void execute(String message) {
    System.out.println("As object of command class. " + message);
  }

  private void showMenu() {
    System.out.println("asLambdaFunction\n"
        + "asMethodReference\n"
        + "asAnonymousClass\n"
        + "asObjectOfCommandClass\n"
        + "exit\n\n"
        + "Enter one of those key and message:");
  }

  public void getTask2() {
    Scanner scanner = new Scanner(System.in);
    String mapKey;
    String message;
    Task2 task2 = new Task2();
    do {
      task2.showMenu();
      System.out.print("Key: ");
      mapKey = scanner.nextLine();
      if (mapKey.equals("exit")) {
        break;
      }
      System.out.print("Message: ");
      message = scanner.nextLine();
      try {
        task2.task2().get(mapKey).execute(message);
      } catch (NullPointerException ignored) {
      }
      System.out.println();
    } while (!mapKey.equals("exit"));
  }
}
