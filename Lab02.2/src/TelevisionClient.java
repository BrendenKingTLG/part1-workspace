public class TelevisionClient {

  public static void main(String[] args) {
      //create first instance
      Television tv1 = new Television();

      //change default values
      tv1.setBrand("Samsung");


      //check methods
      tv1.turnOn();
      tv1.turnOff();

    System.out.println(tv1);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

      //create second instance
    Television tv2 = new Television("LG");

      //change default values
    tv2.setVolume(101);

      //check methods
    tv2.turnOn();
    tv2.turnOff();
    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("Onn", 20);

    System.out.println(tv3);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());

  }
}
