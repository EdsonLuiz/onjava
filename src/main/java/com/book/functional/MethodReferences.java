package com.book.functional;

/*
 * Start with a single method Interface
 */
interface Callable {
  void call(String s);
}

/*
 * The signature (argument types and return types) of show()
 * conforms to the signature of Callable's call()
 */
class Describe {
  void show(String msg) {
    System.out.println(msg);
  }
}

/*
 * The signature of hello() is also
 * signature-conformant to call()
 */
public class MethodReferences {
  static void hello(String name) {
    System.out.println("Hello, " + name);
  }

  /*
   * help() is also signature-coformant to call()
   */
  static class Description {
    String about;
    Description(String desc) { about = desc;}
    void help(String msg) {
      System.out.println(about + " " + msg);
    }
  }

  /*
   * assist() is a static method inside a static inner class.
   */
  static class Helper {
    static void assist(String msg) {
      System.out.println(msg);
    }
  }

  public static void main(String[] args) {
    Describe d = new Describe();

    /*
     * [6]
     * Assign a method reference for the Describe object to a Callable,
     * which doesn't have a show() method but rather a call() method.
     * For Java this is Ok, because the method reference is 
     * signature-conformant to Callable's call() method.
     */
    Callable c = d::show;
    
    /*
     * We can now invoke show() by calling call(), Java maps call() onto show()
     */
    c.call("call()");

    /*
     * [8]
     * This is a static method reference.
     */
    c = MethodReferences::hello;

    c.call("Bob");

    /*
     * Another version of [6].
     * A method reference attached to a live object, which is sometimes called a
     * bound method reference.
     */
    c = new Description("valuable")::help;
    c.call("information");

    c = Helper::assist;
    
    /*
     * A method reference for a static method os a static inner class looks
     * just like the outer-class version at [8]
     */
    c.call("Help");
  }
}
