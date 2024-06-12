package mobile_communication.mobile_company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import mobile_communication.mobile_company.rates.MobileCompanyEnum;

public class MobileCompany {

  private List<Rates> rateList;

  public MobileCompany() {
    this.rateList = new ArrayList<>();
  }

  public List<Rates> getRateList(MobileCompanyEnum mobileCompany) {
    for (int i = 0; i < mobileCompany.getRates().length; i++) {
      rateList.add(mobileCompany.getRates()[i]);
    }
    return rateList;
  }

  public void printRateList() {
    System.out.println("Rates: ");
    for (Rates rate : rateList) {
      System.out.println(rate);
    }
  }

  public double getFullNumberOfClients() {
    double fullCapacity = 0;
    for (int i = 0; i < rateList.size(); i++) {
      fullCapacity += rateList.get(i).getNumberOfClients();
    }
    return fullCapacity;
  }

  public void sort() {
    rateList.sort(Comparator.<Rates>reverseOrder());
  }

  public List<Rates> getRatesByParams(char firstLetterRate, double minCost, double maxCost) {
    List<Rates> rateSelected = new ArrayList<>();
    for (Rates rate : rateList) {
      if (rate.getSubscriptionFee() >= minCost && rate.getSubscriptionFee() <= maxCost &&
          rate.getNameRate().charAt(0) == firstLetterRate) {
        rateSelected.add(rate);
      }
    }
    return rateSelected;
  }
}
