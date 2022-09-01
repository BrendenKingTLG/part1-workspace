public class TelevisionClient {

  public static void main(String[] args) {
      //create first instance
      Television tv1 = new Television();

      //change default values
      tv1.brand = "Samsung";
      tv1.volume = 10;

      //check methods
      tv1.turnOn();
      tv1.turnOff();

      //create second instance
      Television tv2 = new Television();

      //change default values
      tv2.brand = "LG";
      tv2.volume = 8;

      //check methods
      tv2.turnOn();
      tv2.turnOff();

  }
}
