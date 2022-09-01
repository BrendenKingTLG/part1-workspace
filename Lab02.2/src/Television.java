
public class Television {
  //instance variables
  String brand;
  int volume;
  boolean on;

  //methods
  void turnOn(){
    System.out.println("turning on " + brand + " tv");
    on = true;
  }

  void turnOff(){
    System.out.println("turning off " + brand + " tv");
    on = false;
  }

  }

