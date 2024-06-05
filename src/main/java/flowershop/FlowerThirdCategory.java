package flowershop;

public class FlowerThirdCategory extends Flower{
  public FlowerThirdCategory(FlowerThirdCategoryEnum flowerName, float stemLength, FreshnessLevel freshnessLevel) {
    super(flowerName.getFlowerName(), flowerName.getCost(), stemLength, freshnessLevel);
  }
}
