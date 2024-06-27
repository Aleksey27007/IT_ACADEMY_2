package flowershop;

public class FlowerFirstCategory extends Flower{
  public FlowerFirstCategory(FlowerFirstCategoryEnum flowerName, float stemLength,
      FreshnessLevel freshnessLevel) {
    super(flowerName.getFlowerName(), flowerName.getCost(), stemLength, freshnessLevel);
  }

}
