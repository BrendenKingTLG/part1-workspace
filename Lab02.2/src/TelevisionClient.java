public class TelevisionClient {

  public static void main(String[] args) {
      //create first instance
      Television tv1 = new Television("Onn", 20);

      //change default values
      //tv1.setBrand("Samsung");
     // tv1.setVolume(10);


      //check methods
      tv1.turnOn();
      tv1.turnOff();

      //create second instance
      Television tv2 = new Television("LG", 50);

      //change default values
      // tv2.setBrand("LG");
      // tv2.setVolume(10);

      //check methods
      tv2.turnOn();
      tv2.turnOff();


  }
}
