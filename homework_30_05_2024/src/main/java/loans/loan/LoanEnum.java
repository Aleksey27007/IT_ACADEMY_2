package loans.loan;

public enum LoanEnum {
  BELARUSBANK(new Loan[] {
      new Loan("BELARUSBANK", 70000, 9.5, 5),
      new Loan("BELARUSBANK", 120000, 13, 10),
      new Loan("BELARUSBANK", 90000, 14.5, 5)
  }),
  ALFA_BANK(new Loan[] {
      new Loan("ALFA_BANK", 90000, 10.5, 7),
      new Loan("ALFA_BANK", 150000, 17, 10),
      new Loan("ALFA_BANK", 40000, 14.5, 5)
  }),
  PRIORBANK(new Loan[] {
      new Loan("PRIORBANK", 70000, 8.5, 5),
      new Loan("PRIORBANK", 90000, 10.5, 5 ),
      new Loan("PRIORBANK", 140000, 14.5, 10)
  });

  private Loan[] list;

  LoanEnum(Loan[] list) {
    this.list = list;
  }

  public Loan[] getList() {
    return list;
  }

  public void setList(Loan[] list) {
    this.list = list;
  }
}
