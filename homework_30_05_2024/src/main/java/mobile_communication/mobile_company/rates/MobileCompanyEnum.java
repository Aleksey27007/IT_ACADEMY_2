package mobile_communication.mobile_company.rates;

import mobile_communication.mobile_company.Rates;

public enum MobileCompanyEnum {

  MOBILE_COMPANY_A1(new Rates[] {
      new Rate("DriveUnlim", 1890, 35.00),
      new Rate("DriveActive", 2120, 28.00),
      new Rate("DriveStart", 2457, 19.00),
      new Rate("GIGA", 1550, 12.00),
      new Rate("Childlike", 1960, 15.00),
      new Rate("Simple", 3540, 6.00)
  });

  private Rates[] rates;

  MobileCompanyEnum(Rates[] rates) {
    this.rates = rates;
  }

  public Rates[] getRates() {
    return rates;
  }

  public void setRates(Rates[] rates) {
    this.rates = rates;
  }
}
