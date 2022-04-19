package se.lexicon.inheritancePractice;

public class EmployeeIdSequencer {

  private static int sequencer = 1000;

  public static int nextId(){
    return ++ sequencer;
  }
}
