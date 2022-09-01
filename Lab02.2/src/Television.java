
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

  String isTeleOn(){
    if(this.on) {
      String onStatement = "this " + brand + " tv is on";
      return onStatement;
    } else {
      String offStatement = "this " + brand + " tv is off";
      return offStatement;
    }
  }

}
