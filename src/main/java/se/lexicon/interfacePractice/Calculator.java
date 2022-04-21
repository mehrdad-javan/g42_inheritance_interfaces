package se.lexicon.interfacePractice;

import java.util.Scanner;

public interface Calculator {

  // static fields
  Scanner SC = new Scanner(System.in);

  // abstract methods
  int addition(int number1, int number2);
  int subtraction(int number1, int number2);
  int multiplication(int number1, int number2);
  int division(int number1, int number2);

  default void welcomeMessage(){
    System.out.println("######### Welcome to my calculator ##########");
  }

  static String takeInput(){
    return SC.nextLine();
  }
}
