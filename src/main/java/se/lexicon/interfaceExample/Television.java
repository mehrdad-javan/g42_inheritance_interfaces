package se.lexicon.interfaceExample;

public interface Television {

  int MAX_CHANNELS = 999;

  void on();
  void off();
  void raiseVolume();
  // more abstract methods

  default void menuTemplate(){
    System.out.println("default menu for tv");
  }

  static void resetFactory(){
    System.out.println("reset factory");
  }


}
