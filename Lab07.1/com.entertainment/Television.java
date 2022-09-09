
public class Television {

  //variables
  public static final int MIN_VOLUME = 0, MAX_VOLUME = 100;
  private static int INSTANCE_COUNT = 0;
  private String brand;
  private int volume, oldVolume;
  private boolean isMuted;
  private DisplayType display = DisplayType.LED;
  public static final String[] VALID_BRANDS = {"LG", "Samsung"};

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

  public Television(String brand, int volume, DisplayType display) {
    this(brand);
    this.setVolume(volume);
    this.setDisplay(display);
  }

  //business methods
  public void mute(){
    if(!this.isMuted()){
      oldVolume = this.volume;
      this.setVolume(0);
      isMuted = true;
    } else {
      this.setVolume(oldVolume);
      this.setMuted(false);
    }
  }

  void turnOn() {
    System.out.println("turning on " + getBrand() + " tv " + "at volume " + getVolume());

  }

  void turnOff() {
    System.out.println("turning off " + getBrand() + " tv " + "at volume " + getVolume());

  }

  @Override
  public String toString() {
    return "Television " + "brand " + getBrand() + ", " + "volume " + getVolume() + " is mute: " + isMuted() + " display type " + getDisplay();
  }

  //getters & setters
  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(final DisplayType display) {
    this.display = display;
  }
  public boolean isMuted() {
    return isMuted;
  }

  public void setMuted(final boolean muted) {
    isMuted = muted;
  }

  public static int getInstanceCount() {
    return INSTANCE_COUNT;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
   /* switch(brand) {
      case "lg":
        this.brand = brand;
        break;
      case "samsung":
        this.brand = brand;
        break;
      default:
        System.out.printf("%s is invalid, please enter one of the following: samsung or lg %n", brand);
        break;
        */
    for(String s: VALID_BRANDS){
      if(brand.equals(s)){
        this.brand = s;
      } else {
        System.out.printf("%s is invalid, please enter one of the following: samsung or lg %n", brand);
      }
    }
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

