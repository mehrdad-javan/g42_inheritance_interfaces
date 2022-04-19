package se.lexicon.inheritanceExample;

public class Animal {

  private String name;
  private double weight;

  public Animal() {
  }

  public Animal(String name, double weight) {
    this.name = name;
    this.weight = weight;
  }

  public void eat(){
    System.out.println("Default Eating Behavior for Animal");
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

  @Override
  public String toString() {
    return "Animal{" +
            "name='" + name + '\'' +
            ", weight=" + weight +
            '}';
  }
}
