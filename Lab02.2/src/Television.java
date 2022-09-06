
public class Television {

  //variables
  public static final int MIN_VOLUME = 0, MAX_VOLUME = 100;
  private static int INSTANCE_COUNT = 0;
  private String brand;
  private int volume;



  //constructor
  public Television() {
    INSTANCE_COUNT++;
  }

  public Television(String brand) {
    this();
    this.setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    this.setVolume(volume);
  }


  //business methods
  void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("turning on " + getBrand() + " tv " + "at volume " + getVolume());

  }

  void turnOff() {
    System.out.println("turning off " + getBrand() + " tv " + "at volume " + getVolume());

  }

  private boolean verifyInternetConnection() {
    return true;
  }

  @Override
  public String toString() {
    return "Television " + "brand " + getBrand() + " , " + "volume " + getVolume();
  }


  //getters & setters
  public static int getInstanceCount() {
    return INSTANCE_COUNT;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid, volume must be between %d and %d (inclusive). %n", volume, MAX_VOLUME, MIN_VOLUME);
    } else {
      this.volume = volume;
    }
  }
}

