package play_room.age_category;

public enum CategoryEnum {
  CHILDREN_FIRST_CAT("3 - 6"),
  CHILDREN_SECOND_CAT("6 - 9"),
  CHILDREN_THIRD_CAT("9 - 11");

  private String category;

  CategoryEnum(String category) {
    this.category = category;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
