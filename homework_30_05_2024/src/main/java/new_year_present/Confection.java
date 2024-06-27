package new_year_present;

public class Confection implements Comparable<Confection>{
  private String name;
  private float weight;
  private float sugarLevel;
  private String type;

  public Confection(String name, float weight, float sugarLevel, String type) {
    this.name = name;
    this.weight = weight;
    this.sugarLevel = sugarLevel;
    this.type = type;
  }

  public String getName() {
    return name;
  }

  public float getWeight() {
    return weight;
  }


  public String getType() {
    return type;
  }


  public float getSugarLevel() {
    return sugarLevel;
  }

  public void setSugarLevel(float sugarLevel) {
    this.sugarLevel = sugarLevel;
  }

  @Override
  public String toString() {
    return "Confection{" +
        "name='" + name + '\'' +
        ", weight=" + weight +
        ", sugarLevel=" + sugarLevel +
        ", type='" + type + '\'' +
        '}';
  }

  @Override
  public int compareTo(Confection o) {
    int result = this.name.compareTo(o.name);
    return result;
  }
}
