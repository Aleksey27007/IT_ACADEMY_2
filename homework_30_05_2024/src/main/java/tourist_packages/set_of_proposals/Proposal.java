package tourist_packages.set_of_proposals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import tourist_packages.number_of_days.NumberOfDaysEnum;
import tourist_packages.nutrition.NutritionEnum;
import tourist_packages.reason.ReasonEnum;
import tourist_packages.transport.TransportEnum;

public class Proposal {
  private String country;
  private NumberOfDaysEnum days;
  private ReasonEnum reason;
  private NutritionEnum nutrition;
  private TransportEnum transport;

  public Proposal(String country, NumberOfDaysEnum days, ReasonEnum reason, NutritionEnum nutrition,
      TransportEnum transport) {
    this.country = country;
    this.days = days;
    this.reason = reason;
    this.nutrition = nutrition;
    this.transport = transport;
  }

  public static List<Proposal> getProposalList() {
    return new ArrayList<>(Arrays.asList(ListOfProposalsEnum.PROPOSALS.getList()));
  }

  @Override
  public String toString() {
    return "country: " + country +
        ", days: " + days +
        ", reason: " + reason +
        ", nutrition: " + nutrition +
        ", transport: " + transport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Proposal)) {
      return false;
    }
    Proposal proposal = (Proposal) o;
    return getCountry().equals(proposal.getCountry()) && getDays() == proposal.getDays()
        && getReason() == proposal.getReason() && getNutrition() == proposal.getNutrition()
        && getTransport() == proposal.getTransport();
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCountry(), getDays(), getReason(), getNutrition(), getTransport());
  }

  public static void printProposalList(List<Proposal> list) {
    for (Proposal proposal:list) {
      System.out.println(proposal);
    }
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public NumberOfDaysEnum getDays() {
    return days;
  }

  public void setDays(NumberOfDaysEnum days) {
    this.days = days;
  }

  public ReasonEnum getReason() {
    return reason;
  }

  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }

  public NutritionEnum getNutrition() {
    return nutrition;
  }

  public void setNutrition(NutritionEnum nutrition) {
    this.nutrition = nutrition;
  }

  public TransportEnum getTransport() {
    return transport;
  }

  public void setTransport(TransportEnum transport) {
    this.transport = transport;
  }


}
