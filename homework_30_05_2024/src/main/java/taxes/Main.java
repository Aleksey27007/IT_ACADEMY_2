package taxes;

import static taxes.payments.PersonalPaymentsEnum.MY_PAYMENTS;



public class Main {
  /*
  * Налоги. Определить множество и сумму налоговых выплат физического лица за год с учетом доходов с основного
  * и дополнительного мест работы, авторских вознаграждений, продажи имущества, получения в подарок денежных сумм и имущества,
  * переводов из-за границы, льгот на детей и материальную помощь. Провести сортировку налогов по сумме.
   */
  public static void main(String[] args) {
    Bank bank = new Bank(MY_PAYMENTS);
    double myNettoPayments = bank.getNettoPayment();
    System.out.println(myNettoPayments);

    bank.printPayments();
    System.out.println("-----------------------------------");

    bank.sortTaxesBySum();

    bank.printPayments();

  }
}
