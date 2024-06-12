package mobile_communication;

import java.util.List;
import mobile_communication.mobile_company.Rates;
import mobile_communication.mobile_company.MobileCompany;
import mobile_communication.mobile_company.rates.MobileCompanyEnum;

public class Main {
  /*
  * Мобильная связь. Определить иерархию тарифов мобильной компании. Создать список тарифов компании.
  * Посчитать общую численность клиентов. Провести сортировку тарифов на основе размера абонентской платы.
  * Найти тариф в компании, соответствующий заданному диапазону параметров.
   */

  public static void main(String[] args) {

    MobileCompany mobileCompany = new MobileCompany();

    mobileCompany.getRateList(MobileCompanyEnum.MOBILE_COMPANY_A1);

    mobileCompany.printRateList();

    System.out.println(mobileCompany.getFullNumberOfClients());


    mobileCompany.sort();
    mobileCompany.printRateList();

    List<Rates> selectedRates = mobileCompany.getRatesByParams('D', 20, 40);
    System.out.println("---------------------------------------");
    for (Rates rate : selectedRates) {
      System.out.println(rate);
    }
  }
}
