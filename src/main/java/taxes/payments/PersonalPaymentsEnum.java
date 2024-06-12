package taxes.payments;

public enum PersonalPaymentsEnum {

  MY_PAYMENTS(new PaymentsEnum[] {
      PaymentsEnum.BASIC_INCOME,
      PaymentsEnum.ADDITIONAL_INCOME,
      PaymentsEnum.AWARD,
      PaymentsEnum.SALE_OF_PROPERTY,
      PaymentsEnum.GIFT_REWARDS,
      PaymentsEnum.TRANSFER_FROM_ABROAD,
      PaymentsEnum.FINANCIAL_ASSISTANCE
  });
  private PaymentsEnum[] payments;

  PersonalPaymentsEnum(PaymentsEnum[] payments) {
    this.payments = payments;
  }

  public PaymentsEnum[] getPayments() {
    return payments;
  }
}
