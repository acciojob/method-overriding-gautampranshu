package com.driver;
 class A {
  public String meth()
  {
    return "Invoking method from class A";
  }
}
 class B extends A{
  public String meth()
  {
    return "Method is overridden in Extendend class B";
  }
}
public class Main {
  public static void main(String[] args) {
    A a = new B();
    //System.out.println(b.meth());
    //System.out.println(a.meth());
    a.meth();
    B b = new B();
    //System.out.println(b.meth());
    b.meth();
  }
}