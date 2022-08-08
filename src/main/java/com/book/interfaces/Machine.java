package com.book.interfaces;

class Bing implements Operations {
  @Override
  public void execute() {
    Operations.show("Bing");
  }
}

class Crack implements Operations {
  @Override
  public void execute() {
    Operations.show("Crac");   
  }
}

class Twist implements Operations {
  @Override
  public void execute() {
    Operations.show("Twist");
  }
}

public class Machine {
  public static void main(String[] args) {
    Operations op = () -> Operations.show("Operation");
    Operations.runOps(
      new Bing(),
      new Crack(),
      new Twist(),
      op
    );
  }
}
