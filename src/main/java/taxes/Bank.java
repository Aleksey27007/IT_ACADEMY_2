package taxes;

import static taxes.payments.PaymentsEnum.ADDITIONAL_INCOME;
import static taxes.payments.PaymentsEnum.AWARD;
import static taxes.payments.PaymentsEnum.BASIC_INCOME;
import static taxes.payments.PaymentsEnum.FINANCIAL_ASSISTANCE;
import static taxes.payments.PaymentsEnum.GIFT_REWARDS;
import static taxes.payments.PaymentsEnum.SALE_OF_PROPERTY;
import static taxes.payments.PaymentsEnum.TRANSFER_FROM_ABROAD;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import taxes.payments.PaymentsEnum;
import taxes.payments.PersonalPaymentsEnum;

public class Bank {

  private final int MONTHS = 12;
  private List<PaymentsEnum> myPayments;

  public Bank(PersonalPaymentsEnum payments) {
    this.myPayments = new ArrayList<>();
    for (int i = 0; i < payments.getPayments().length; i++) {
      myPayments.add(payments.getPayments()[i]);
    }
  }

  public double getNettoPayment() {
    double netto = 0;
    for (int i = 0; i < myPayments.size(); i++) {
      if (myPayments.get(i).equals(BASIC_INCOME)
          || myPayments.get(i).equals(ADDITIONAL_INCOME) ||
          myPayments.get(i).equals(FINANCIAL_ASSISTANCE)) {
        netto += (myPayments.get(i).getCash() - ((myPayments.get(i).getCash() / 100)
            * myPayments.get(i).getTax())) * MONTHS;
      } else {
        continue;
      }
    }

    netto += getOtherNettoPayments();
    return netto;
  }


  private double getOtherNettoPayments() {
    double netto = 0;
    for (int i = 0; i < myPayments.size(); i++) {
      if (myPayments.get(i).equals(AWARD)
          || myPayments.get(i).equals(SALE_OF_PROPERTY) ||
          myPayments.get(i).equals(GIFT_REWARDS) ||
          myPayments.get(i).equals(TRANSFER_FROM_ABROAD)) {
        if (myPayments.get(i).getTax() != 0) {
          netto += (myPayments.get(i).getCash() - (myPayments.get(i).getCash() / 100))
              * myPayments.get(i).getTax();
        } else {
          netto += myPayments.get(i).getCash() - (myPayments.get(i).getCash() / 100);
        }
      }
    }
    return netto;
  }

  public void printPayments() {
    for (PaymentsEnum payments: myPayments) {
      System.out.println(payments);
    }
  }


  public void sortTaxesBySum() {
    Collections.sort(myPayments, new Comparator<PaymentsEnum>() {
      @Override
      public int compare(PaymentsEnum o1, PaymentsEnum o2) {
        int result = 0;
        if (o1.getTax() != 0) {
          result = (int) ((o1.getCash() / 100) * o1.getTax() - (o2.getCash() / 100) * o2.getTax());
        } else {
          result = (int) ((o1.getCash() / 100) * 1 - (o2.getCash() / 100) * 1);
        }
        return result;
      }
    });
  }
}