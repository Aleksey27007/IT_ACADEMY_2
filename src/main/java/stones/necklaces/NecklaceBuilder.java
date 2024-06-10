package stones.necklaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import stones.stones.Stone;

public class NecklaceBuilder {
  private List<Stone> necklace;

  public NecklaceBuilder() {
    this.necklace = new ArrayList<>();
  }

  public void makeNecklace(NecklacesEnum necklace) {
    for (int i = 0; i < necklace.getStones().length; i++) {
      this.necklace.add(necklace.getStones()[i]);
    }
  }

  public void calculateCarat() {
    double sumCarat = 0;
    for (int i = 0; i < necklace.size(); i++) {
      sumCarat += necklace.get(i).getWeight() * 5;  // 1g = 5 carat
    }
    System.out.printf("Sum carat of this necklace: %.2f\n", sumCarat);
  }

  public void calculateCost() {
    double sumCost = 0;
    for (int i = 0; i < necklace.size(); i++) {
      sumCost += necklace.get(i).getCost();  // 1g = 5 carat
    }
    System.out.printf("Full price of this necklace: %.2f\n", sumCost);
  }

  public void sort() {
    necklace.sort(Comparator.<Stone> reverseOrder());
  }

  public void printInfo() {
    System.out.println("------------------------------------------------------------");
    for (Stone stone : necklace) {
      System.out.println(stone);
    }
  }

  public List<Stone> getStonesByTransparency(double min, double max){
    List<Stone> stonesSelected = new ArrayList<>();
    for (Stone stone : necklace) {
      if(stone.getTransparency() >= min && stone.getTransparency() <= max){
        stonesSelected.add(stone);
      }
    }
    return stonesSelected;
  }
}
