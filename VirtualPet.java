class VirtualPet {
//Attributes//
  private String name;
  private int hunger;
  private int thirst;
  private int boredom;
  private int tiredness;

//Constructor//
  public VirtualPet(String name, int hunger, int thirst, int boredom, int tiredness) {
    this.name = name;
    this.hunger = hunger;
    this.thirst = thirst;
    this.boredom = boredom;
    this.tiredness = tiredness;
   
  }

 //Getters//
  public String getName() {
    return this.name;
  }

  public int getHunger() {
    return this.hunger;
  }

  public int getThirst() {
    return this.thirst;
  }

  public int getBoredom() {
    return this.boredom;
  }

  public int getTiredness() {
    return this.tiredness;
  }

//Setters//
  public void setName(String name) {
    this.name = name;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public void setBoredom(int boredom) {
    this.boredom = boredom;
  }

  public void setTiredness(int tiredness) {
    this.tiredness = tiredness;
  }


 //Behaviours//

  public void feed(int feed) {
    this.hunger -= feed;
  }

  public void water(int water) {
    this.thirst -= water;
  }

  public void bored(int bored) {
    this.boredom -= bored;
  }

  public void tired(int tired) {
    this.tiredness -= tired;
  }

 public void nothing(int nothing) {
   this.hunger -= nothing; 
   this.thirst -= nothing;
   this.boredom -= nothing;
   this.tiredness -= nothing;
 }

  public void tick(int tick) {
    System.out.println("Hunger is Increasing!!!");
    this.hunger += tick;
    System.out.println("Thirst is Increasing!!!");
    this.thirst += tick;
    System.out.println("Boredom is Increasing!!!");
    this.boredom += tick;
    System.out.println("Tiredness is Increasing!!! \n");
    this.tiredness += tick;
  }

//toString Method to print//

  public String toString() {
    String result = "";
    result += "Name: " + this.name + "\n";
    result += "Hunger: " + this.hunger + "\n";
    result += "Thirst: " + this.thirst + "\n";
    result += "Boredom: " + this.boredom + "\n";
    result += "Tiredness: " + this.tiredness + "\n";
    result += "\n";

    return result;

  }
}