public class TelevisionValidationTest {

  public static void main(String[] args) {
    //create instances
    Television tvTesterBrand = new Television();
    Television tvTesterVolume = new Television("lg");
    Television tvTesterMute = new Television("samsung");

    //test brand
    tvTesterBrand.setBrand("lenovo");
    tvTesterBrand.setBrand("samsung");
    System.out.println(tvTesterBrand);
    System.out.println();

    //test volume
    tvTesterVolume.setVolume(-10);
    tvTesterVolume.setVolume(200);
    tvTesterVolume.setVolume(50);
    System.out.println(tvTesterVolume);
    System.out.println();

    //test mute
    tvTesterMute.setVolume(20);
    System.out.println(tvTesterMute);
    tvTesterMute.mute();
    System.out.println(tvTesterMute);
    tvTesterMute.mute();
    System.out.println(tvTesterMute);

  }

}
