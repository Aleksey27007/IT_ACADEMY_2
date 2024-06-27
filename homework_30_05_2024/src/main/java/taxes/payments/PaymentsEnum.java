package taxes.payments;

public enum PaymentsEnum {

  BASIC_INCOME(2500, 13),
  ADDITIONAL_INCOME(1000, 13),
  AWARD(500, 13),
  SALE_OF_PROPERTY(4000, 0),
  GIFT_REWARDS(1000, 0),
  TRANSFER_FROM_ABROAD(500, 10),
  FINANCIAL_ASSISTANCE(800, 7);

  private double cash;
  private double tax;

  PaymentsEnum(double cash, double tax) {
    this.cash = cash;
    this.tax = tax;
  }

  public double getCash() {
    return cash;
  }


  public double getTax() {
    return tax;
  }

  @Override
  public String toString() {
    return "PaymentsEnum{" +
        "cash=" + cash +
        ", tax=" + tax +
        '}';
  }
}
