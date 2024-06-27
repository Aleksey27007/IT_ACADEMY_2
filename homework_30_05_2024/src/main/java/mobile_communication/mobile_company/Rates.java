package mobile_communication.mobile_company;

public class Rates implements Comparable<Rates> {
  private String nameRate;
  private int numberOfClients;
  private double subscriptionFee;

  public Rates(String nameRate, int numberOfClients, double subscriptionFee) {
    this.nameRate = nameRate;
    this.numberOfClients = numberOfClients;
    this.subscriptionFee = subscriptionFee;
  }

  public String getNameRate() {
    return nameRate;
  }

  public void setNameRate(String nameRate) {
    this.nameRate = nameRate;
  }

  public int getNumberOfClients() {
    return numberOfClients;
  }

  public void setNumberOfClients(int numberOfClients) {
    this.numberOfClients = numberOfClients;
  }

  public double getSubscriptionFee() {
    return subscriptionFee;
  }

  public void setSubscriptionFee(double subscriptionFee) {
    this.subscriptionFee = subscriptionFee;
  }

  @Override
  public String toString() {
    return "nameRate: " + nameRate +
        ", numberOfClients: " + numberOfClients +
        ", subscriptionFee: " + subscriptionFee;
  }

  @Override
  public int compareTo(Rates obj) {
    Rates tmp = obj;
    if (this.subscriptionFee < tmp.subscriptionFee) {
      return -1;
    } else if (this.subscriptionFee > tmp.subscriptionFee) {
      return 1;
    }
    return 0;
  }
}
