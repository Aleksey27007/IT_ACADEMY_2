package tourist_packages;

import static tourist_packages.set_of_proposals.Proposal.getProposalList;
import static tourist_packages.set_of_proposals.Proposal.printProposalList;

import java.util.Comparator;
import java.util.List;
import tourist_packages.client.Client;
import tourist_packages.nutrition.NutritionEnum;
import tourist_packages.reason.ReasonEnum;
import tourist_packages.set_of_proposals.Proposal;
import tourist_packages.transport.TransportEnum;

public class Main {
  /*
  * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
  * (отдых, экскурсии, лечение, шопинг, круиз и т д) для оптимального выбора. Учитывать возможность выбора транспорта,
  * питания и числа дней. Реализовать выбор и сортировку путевок.*/

  public static void main(String[] args) {
    List<Proposal> proposalList = getProposalList();

    System.out.println("All proposal --------------------------------------------------------------");
    printProposalList(proposalList);

    proposalList.sort(new Comparator<Proposal>() {
      @Override
      public int compare(Proposal o1, Proposal o2) {
        return o1.getDays().getDays() - o2.getDays().getDays();
      }
    });
    System.out.println("All proposal --------------------------------------------------------------");
    printProposalList(proposalList);

    Client client = new Client("Aleksey");
    System.out.println("CHOOSE--------------------------------------------------------------------");
    client.chooseATour(proposalList, "Egypt", 10, ReasonEnum.RECREATION,
        NutritionEnum.HB_PLUS, TransportEnum.SHARED_BUS);

  }
}
