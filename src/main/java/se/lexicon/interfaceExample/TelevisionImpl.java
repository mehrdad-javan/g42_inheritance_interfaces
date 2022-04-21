package se.lexicon.interfaceExample;

public class TelevisionImpl implements Television, SmartTV {

  private String name;
  private String brand;

  // constructors
  // setters and getters

  @Override
  public void on() {
    // implement the method body
  }

  @Override
  public void off() {
    // implement the method body
  }

  @Override
  public void raiseVolume() {
    // implement the method body
  }

  public void test(){
    menuTemplate();
    // how to call the static methods?
    Television.resetFactory();
    SmartTV.resetFactory();
  }

/*
  @Override
  public void menuTemplate(){
    System.out.println("my menu template");
  }
*/

  @Override
  public void connectToInternet() {

  }

}
