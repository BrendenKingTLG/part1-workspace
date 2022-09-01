public class TelevisionClient {

  public static void main(String[] args) {
      //create first instance
      Television tv1 = new Television();

      //change default values
      tv1.brand = "Samsung";
      tv1.volume = 10;

      //create second instance
      Television tv2 = new Television();

      //change default values
      tv2.brand = "LG";
      tv2.volume = 8;

      System.out.println();
      tv1.turnOn();
      tv1.isTeleOn();
      tv1.turnOff();
      tv1.isTeleOn();

      tv2.isTeleOn();
      tv2.turnOn();
      tv2.isTeleOn();
      tv2.turnOff();
      tv2.isTeleOn();

  }
}
