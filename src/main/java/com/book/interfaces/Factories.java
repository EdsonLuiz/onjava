package com.book.interfaces;

interface Service {
  void mehtod1();
  void mehtod2();
}

interface ServiceFactory {
  Service getService();
}

class Service1 implements Service {
  @Override
  public void mehtod1() {
    System.out.println("Service1 method1");
  }

  @Override
  public void mehtod2() {
    System.out.println("Service1 method2");
  }
}

class ServiceFactory1 implements ServiceFactory {
  @Override
  public Service getService() {
    return new Service1();
  }
}

class Service2 implements Service {
  Service2() {} // Package access 

  @Override
  public void mehtod1() {
    System.out.println("Service2 method1");   
  }

  @Override
  public void mehtod2() {
    System.out.println("Service2 method2");
  }
}

class Service2Factory implements ServiceFactory {
  @Override
  public Service getService() {
    return new Service2();
  }
}

public class Factories {
  public static void serviceConsumer(ServiceFactory fact) {
    Service s = fact.getService();
    s.mehtod1();
    s.mehtod2();
  }

  public static void main(String[] args) {
    serviceConsumer(new ServiceFactory1());
    // Services are completely interchangeable
    serviceConsumer(new Service2Factory());
  }
}
