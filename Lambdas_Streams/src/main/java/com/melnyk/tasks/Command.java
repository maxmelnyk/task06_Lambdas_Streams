package com.melnyk.tasks;

@FunctionalInterface
public interface Command {
  void execute(String message);
}
