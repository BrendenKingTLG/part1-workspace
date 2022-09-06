
public class Television {

  //instance variables
  private String brand;
  private int volume;


  //constructor
  public Television(String brand) {
    setBrand(brand);
  }

  public Television(String brand, int volume){
    this(brand);
    setVolume(volume);
  }


  //business methods
  void turnOn(){
    boolean isConnected = verifyInternetConnection();
    System.out.println("turning on " + getBrand() + " tv" + "at volume " + getVolume());

  }

  void turnOff(){
    System.out.println("turning off " + getBrand() + " tv"+ "at volume " + getVolume());

  }

  private boolean verifyInternetConnection() {
    return true;
  }

  @Override
  public String toString() {
    return "Television " + "brand " + getBrand() + " , " + "volume " + getVolume();
  }


  //getters & setters
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
    this.volume = volume;
  }


  }

