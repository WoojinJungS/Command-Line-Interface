

public class DataHandle {
  DateData date;
  int fileNum;
  
  #maybe make date into a seperate class?
  public DataHandle (int year, int month, int day) {
    date = new DateData(year, month, day);
    fileNum = getFileNum(date);
  }

  private boolean getFileNum (Date date) {
    #to be handled on daily writer module
  }

  private boolean validateNumber (int toBeValidated, int validationType) {
    /*
    This function validates whether the given number is validationType digits or not.
    This only accepts 2 or 4 as validationType to prevent possible errors.

    Room for massive improvement, but going the easy and safe way for now.
    */
    boolean validation;

    if (validationType == 2) {
        validation = (toBeValidated > 9) &&
                     (toBeValidated < 100);
    }

    if (validationType == 4) {
        validation = (toBeValidated > 999) &&
                     (toBeValidated < 10000);
    }

    return validation;
  }
}

public class DateData {
  private int year;
  private int month;
  private int day;

  public DateData(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  @Override
  public String toString() {
    return String.format("%04d-%02d-%02d", year, month, day);
  }
}