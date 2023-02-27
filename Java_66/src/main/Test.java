package main;

public class Test {
  public static void main (String[] args) {
    Box b = new Box<Integer>(15);
    System.out.println(b.getValue());
    
    Box b2 = new Box<String>("Hello");
    System.out.println(b2.getValue());
    
    Box b3 = new Box<Double>(15.5);
    System.out.println(b3.getValue());
  }
}