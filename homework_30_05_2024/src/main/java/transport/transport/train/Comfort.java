package transport.transport.train;

public enum Comfort {
  FIRST_CLASS("Coupe", 1),
  SECOND_CLASS("Seating", 2);

  private String nameClass;
  private int level;

  Comfort(String nameClass, int level) {
    this.nameClass = nameClass;
    this.level = level;
  }

  public int getLevel() {
    return level;
  }
}
