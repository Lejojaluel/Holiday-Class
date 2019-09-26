/**
 * Driver class for Holiday class.
 *
 * @author Leroy Valencia
 */
public class HolidayTest {
  public static void main(String[] args) {
    // Default test
    Holiday h = new Holiday(4, Month.JULY, "Independence day");
    // Prints print tests first is using the get functions. The second is using the toString
    // function
    System.out.println(
        h.getHolidayName()
            + " is the name of the holiday that falls on "
            + h.getMonth()
            + " "
            + h.getDay());
    System.out.println("Result of toString() is: " + h.toString());

    // Testing of another Holiday instance with different inputs
    Holiday h2 = new Holiday(25, Month.DEC, "Christmas");
    System.out.println(h2.toString());

    // My error catching blocks to show the validation works.
    try {
      Holiday h3 =
          new Holiday(31, Month.MAR, "dfsd=====sfdgashfdgkjahsgdfsaasdfaasasdsadadasdadsasdsadsdf");
    } catch (Exception e) {
      System.err.println(e);
    }
    try {
      Holiday h4 = new Holiday(30, Month.FEB, "30th of feb");
    } catch (Exception e) {
      System.err.println(e);
    }
    try {
      Holiday h3 = new Holiday(31, Month.MAR, "dfsa*&^*^(*&:${#{$}#$sdsadsdf");
    } catch (Exception e) {
      System.err.println(e);
    }
  }
}
