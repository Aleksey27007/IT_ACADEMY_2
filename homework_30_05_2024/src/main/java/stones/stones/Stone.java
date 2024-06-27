package stones.stones;

public class Stone implements Comparable{

  private String name;
  private double weight;
  private double transparency;
  double cost;

  public Stone(String name, double weight, double transparency, double cost) {
    this.name = name;
    this.weight = weight;
    this.transparency = transparency;
    this.cost = cost;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getTransparency() {
    return transparency;
  }

  public void setTransparency(double transparency) {
    this.transparency = transparency;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "The stone: " + name + ", transparency: " + transparency + ", weight: " + weight
        + ", cost: " + cost;

  }

  public int compareTo(Object obj) {
    Stone tmp = (Stone) obj;
    if (this.cost < tmp.cost) {
      return -1;
    } else if (this.cost > tmp.cost) {
      return 1;
    }
    return 0;
  }
}
