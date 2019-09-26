/**
 * Enumeration class for the months
 *
 * @author Leroy Valencia
 */
public enum Month {
  JAN,
  FEB,
  MAR,
  APR,
  MAY,
  JUNE,
  JULY,
  AUG,
  SEPT,
  OCT,
  NOV,
  DEC;

  public String toString(Month m) {
    switch (m) {
      case JAN:
        return "January";
      case FEB:
        return "February";
      case MAR:
        return "March";
      case APR:
        return "April";
      case MAY:
        return "May";
      case JUNE:
        return "June";
      case JULY:
        return "July";
      case AUG:
        return "August";
      case SEPT:
        return "September";
      case OCT:
        return "October";
      case NOV:
        return "November";
      case DEC:
        return "December";
      default:
        System.err.println("Impossible Month");
        System.exit(1);
    }
    return "Impossible Reach in Month";
  }
}
