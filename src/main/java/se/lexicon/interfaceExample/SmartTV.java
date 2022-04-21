package se.lexicon.interfaceExample;

public interface SmartTV {

  int HDMI_PORTS = 4;

  void connectToInternet();

  /*default void menuTemplate(){
    System.out.println("menu template for smart tv");
  }*/

  static void resetFactory(){
    System.out.println("reset factory for smart tv");
  }



}
