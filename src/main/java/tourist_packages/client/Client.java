package tourist_packages.client;

import java.util.ArrayList;
import java.util.List;
import tourist_packages.nutrition.NutritionEnum;
import tourist_packages.reason.ReasonEnum;
import tourist_packages.set_of_proposals.Proposal;
import tourist_packages.transport.TransportEnum;

public class Client {

  private String name;

  public Client(String name) {
    this.name = name;
  }

  public void chooseATour(List<Proposal> proposalList, String nameTour, int days, ReasonEnum reason,
      NutritionEnum nutrition, TransportEnum transport) {
    List<Proposal> yourList = new ArrayList<>();
    for (int i = 0; i < proposalList.size(); i++) {
      if (nameTour.equals(proposalList.get(i).getCountry()) && days == proposalList.get(i).getDays().getDays()) {
        if (reason.equals(proposalList.get(i).getReason()) && nutrition.equals(
            proposalList.get(i).getNutrition())) {
          if (transport.equals(proposalList.get(i).getTransport())) {
            yourList.add(proposalList.get(i));
            System.out.println(yourList);
          }
        }
      }
    }
//    return yourList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
