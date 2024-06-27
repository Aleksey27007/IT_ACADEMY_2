package tourist_packages.number_of_days;

public enum NumberOfDaysEnum {
  DAYS_3(3),
  DAYS_4(4),
  DAYS_7(7),
  DAYS_10(10),
  DAYS_14(14),
  DAYS_21(21);

  private int days;

  NumberOfDaysEnum(int days) {
    this.days = days;
  }

  public int getDays() {
    return days;
  }

  public void setDays(int days) {
    this.days = days;
  }
}
