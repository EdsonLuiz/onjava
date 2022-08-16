package com.book.interfaces;

interface Monster {
  void menace();
}

/**
 * Produces new Interface
 */
interface DangerousMonster extends Monster {
  void destroy();
}

interface Lethal {
  void kill();
}

/*
 * Use new interface DangerousMonster
 */
class DragonZilla implements DangerousMonster {
  @Override
  public void menace() {}
  @Override
  public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
  void drinkBlood();
}

class VeryBadVampire implements Vampire {
  @Override
  public void destroy() {}

  @Override
  public void menace() {}

  @Override
  public void kill() {}

  @Override
  public void drinkBlood() {}
}

public class HorrorShow {
  static void u(Monster b) {b.menace();}
  static void v(DangerousMonster d) {
    d.menace();
    d.destroy();
  }
  static void w(Lethal l) {l.kill();}

  public static void main(String[] args) {
    DangerousMonster barney = new DragonZilla();
    u(barney);
    v(barney);
    Vampire vlad = new VeryBadVampire();
    u(vlad);
    v(vlad);
    w(vlad);
  }
}
