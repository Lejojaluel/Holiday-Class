/**
 * Class that keeps a holiday. Good note is that I formatted this with the google formatter.
 *
 * @author Leroy Valencia
 */
public class Holiday {
  boolean verboseOption = false; // enable this to see if each check is valid
  // Instance variables that each holiday has
  int day;
  Month month;
  String holidayName;

  /**
   * Constructor for a holiday. Validates the day and name. Month is already validated by the
   * compiler because I am using enumerated types. I can't put an enumerated type that isn't in the
   * Month Enum class.
   *
   * @param day The day in an integer
   * @param month The month given as an enumerated type
   * @param holidayName The String name of the desired holiday
   */
  public Holiday(int day, Month month, String holidayName) {
    // Validate the Day
    if (validateDay(month, day)) {
      verbose("Day is valid");
      // Sets the day
      this.day = day;
    } else {
      verbose("Day is not valid");
      throw new IllegalArgumentException("Day is not Valid. See Above.");
    }
    // Sets the month
    this.month = month;

    // Validate the holiday name
    if (validateHolidayName(holidayName)) {
      verbose("Holiday Name is Valid");
      // sets the holidayName
      this.holidayName = holidayName;
    } else {
      verbose("Holiday Name is not Valid");
      throw new IllegalArgumentException("Holiday Name is not Valid. See Above.");
    }
  }

  /**
   * To string method to return a string with the holidayname month and day
   *
   * @return a string this the holidayName and Month and Day
   */
  public String toString() {
    return holidayName + " is in the month of " + month.toString(this.month) + " on day " + day;
  }

  /**
   * Validates the day of the month
   *
   * @param month Needs the month to make sure the appropriate number of days is in there
   * @param day The day that is going to be tested
   * @return True if valid day or false if not
   */
  public boolean validateDay(Month month, int day) {
    // For 31 day months
    if (month == Month.JAN
        || month == Month.MAR
        || month == Month.MAY
        || month == Month.JULY
        || month == Month.AUG
        || month == Month.OCT
        || month == Month.DEC) {
      if (day > 31) {
        System.err.println("Day cannot be bigger than 31.");
        return false;
      }
      if (day < 0) {
        System.err.println("Day cannot be smaller than 0.");
        return false;
      }
    }
    // if day inbetween 0 and 30 for 30 day months
    if (month == Month.APR || month == Month.JUNE || month == Month.SEPT || month == Month.NOV) {
      if (day > 30) {
        System.err.println("Day cannot be bigger than 30.");
        return false;
      }
      if (day < 0) {
        System.err.println("Day cannot be smaller than 0.");
        return false;
      }
    }
    // if between 0 and 28 for Feb
    if (month == Month.FEB) {
      if (day > 28) {
        System.err.println("Day cannot be bigger than 30.");
        return false;
      }
      if (day < 0) {
        System.err.println("Day cannot be smaller than 0.");
        return false;
      }
    }
    // returns true of none of the catches above trip
    return true;
  }

  /**
   * Validates the holiday name to at least 40 characters and alphanumeric. I don't want a Holiday
   * that is kj2hik5u243ih98(*&(*&&987d873g87982987rg:">>""#@>$:>>":>%#
   *
   * @param holidayName the name to validate
   * @return true if valid or false if not valid
   */
  public boolean validateHolidayName(String holidayName) {
    if (holidayName.length() > 40) {
      System.err.println("Holiday name should stay under 40 characters.");
      return false;
    }
    if (!holidayName.matches("^[a-zA-Z0-9 ]+$")) {
      System.err.println("Holiday name should be Alphanumeric.");
      return false;
    }
    return true;
  }

  /**
   * Getters for the object variables.
   *
   * @return
   */
  public String getHolidayName() {
    return holidayName;
  }

  public int getDay() {
    return day;
  }

  public Month getMonth() {
    return month;
  }

  /**
   * Verbose output to be able to leave debugging prints in but don't out put them
   *
   * @param s The string to print.
   */
  public void verbose(String s) {
    if (verboseOption) {
      System.out.println(s);
    }
  }
}
