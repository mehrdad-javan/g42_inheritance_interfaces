package se.lexicon.enumExample;

public class Test {

  public static void main(String[] args) {
    Car volvo = new Car(1, "Volvo", "V60", Color.GRAY, 2022);
    System.out.println(volvo);
    System.out.println(volvo.getColor().getColorCode());

    Student student1 = new Student("Erik",40, Gender.MALE);

  }
}
