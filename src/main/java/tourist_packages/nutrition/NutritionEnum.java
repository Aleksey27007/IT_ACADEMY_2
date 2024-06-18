package tourist_packages.nutrition;

public enum NutritionEnum {

  BB("Bed&Breakfast"),
  HB("Half Board"),
  HB_PLUS("Half Board Plus");

  private String nutritionType;

  NutritionEnum(String nutritionType) {
    this.nutritionType = nutritionType;
  }

  public String getNutritionType() {
    return nutritionType;
  }

  public void setNutritionType(String nutritionType) {
    this.nutritionType = nutritionType;
  }
}
