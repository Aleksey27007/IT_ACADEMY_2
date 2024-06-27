package tourist_packages.set_of_proposals;

import static tourist_packages.number_of_days.NumberOfDaysEnum.DAYS_10;
import static tourist_packages.number_of_days.NumberOfDaysEnum.DAYS_14;
import static tourist_packages.number_of_days.NumberOfDaysEnum.DAYS_21;
import static tourist_packages.number_of_days.NumberOfDaysEnum.DAYS_7;
import static tourist_packages.nutrition.NutritionEnum.BB;
import static tourist_packages.nutrition.NutritionEnum.HB;
import static tourist_packages.nutrition.NutritionEnum.HB_PLUS;
import static tourist_packages.reason.ReasonEnum.CRUISE;
import static tourist_packages.reason.ReasonEnum.EXCURSIONS;
import static tourist_packages.reason.ReasonEnum.RECREATION;
import static tourist_packages.reason.ReasonEnum.TREATMENT;
import static tourist_packages.transport.TransportEnum.PERSONAL_CAR;
import static tourist_packages.transport.TransportEnum.SHARED_BUS;
import static tourist_packages.transport.TransportEnum.SHARED_MINIBUS;
import static tourist_packages.transport.TransportEnum.TAXI;



public enum ListOfProposalsEnum {
  PROPOSALS(new Proposal[] {
      new Proposal("Egypt", DAYS_7, RECREATION, HB_PLUS, SHARED_MINIBUS),
      new Proposal("Egypt", DAYS_10, RECREATION, HB_PLUS, SHARED_BUS),
      new Proposal("Egypt", DAYS_14, RECREATION, HB_PLUS, SHARED_MINIBUS),
      new Proposal("Egypt", DAYS_7, CRUISE, HB_PLUS, TAXI),
      new Proposal("Egypt", DAYS_10, EXCURSIONS, HB, TAXI),
      new Proposal("Tyrkey", DAYS_21, TREATMENT, BB, SHARED_BUS),
      new Proposal("Tyrkey", DAYS_7, RECREATION, HB_PLUS, SHARED_MINIBUS),
      new Proposal("Tyrkey", DAYS_10, RECREATION, HB_PLUS, SHARED_BUS),
      new Proposal("Tyrkey", DAYS_14, RECREATION, HB_PLUS, SHARED_MINIBUS),
      new Proposal("Tyrkey", DAYS_21, CRUISE, HB_PLUS, PERSONAL_CAR)
  });
  private Proposal[] list;

  ListOfProposalsEnum(Proposal[] list) {
    this.list = list;
  }

  public Proposal[] getList() {
    return list;
  }

  public void setList(Proposal[] list) {
    this.list = list;
  }


}
