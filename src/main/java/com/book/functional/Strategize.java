package com.book.functional;

/*
 * Provides approach() functionality.
 * 
 * By creating different Strategy objects you create different behavior.
 */
interface Strategy {
  String approach(String msg);
}

/*
 * Traditional way of implementing a behavior.
 */
class Soft implements Strategy {
  @Override
  public String approach(String msg) {
    return msg.toLowerCase();
  }
}

class Unrelated {
  static String twice(String msg) {
    return msg + " " + msg;
  }
}

/*
 * Soft is the default strategy assigned in constructor.
 */
public class Strategize {
  Strategy strategy;
  String msg;
  Strategize(String msg) {
    strategy = new Soft(); // 1
    this.msg = msg;
  }

  void communicate() {
    System.out.println(strategy.approach(msg));
  }

  void changeStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public static void main(String[] args) {
    Strategy[] strategies = {
      /*
       * Anonymous inner class to create new strategy.
       */
      new Strategy() {  // 2
        public String approach(String msg) {
          return msg.toUpperCase() + "!";
        }
      },
      /*
       * Lambda expression to create new strategy.
       */
      msg -> msg.substring(0, 5), // 3
      /*
       * Method reference to create new strategy. 
       */
      Unrelated::twice  // 4
    };

    /*
     * Assign and use the default strategy.
     */
    Strategize s = new Strategize("Hello there");
    s.communicate();
    /*
     * Change and use each strategy defined in array.
     */
    for (Strategy newStrategy : strategies) {
      s.changeStrategy(newStrategy);  // 5
      /*
       * Each communicate() produces different behavior.
       */
      s.communicate();  // 6
    }
  }
}
