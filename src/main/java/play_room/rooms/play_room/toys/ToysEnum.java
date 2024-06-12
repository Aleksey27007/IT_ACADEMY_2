package play_room.rooms.play_room.toys;

public enum ToysEnum {

  TOYS(new Toy[]{
      new ToyBall("Ball", 450, ToySizeEnum.BIG),
      new ToyCar("Car", 700, ToySizeEnum.MIDDLE),
      new ToyCube("Cube", 100, ToySizeEnum.SMALL),
      new ToyDall("Dall", 500, ToySizeEnum.MIDDLE),
      new ToyBall("Ball", 300, ToySizeEnum.MIDDLE),
      new ToyCar("Car", 600, ToySizeEnum.BIG),
      new ToyCube("Cube", 150, ToySizeEnum.MIDDLE),
      new ToyDall("Dall", 550, ToySizeEnum.BIG)
  });

  private Toy[] toys;

  ToysEnum(Toy[] toys) {
    this.toys = toys;
  }

  public Toy[] getToys() {
    return toys;
  }

  public void setToys(Toy[] toys) {
    this.toys = toys;
  }
}
